package com.cwt.exam.controller;


import com.cwt.exam.dto.AccountingLine;
import com.cwt.exam.dto.AccountingLineXYZ;
import com.cwt.exam.exception.AccountingException;
import com.cwt.exam.service.AccountService;
import com.cwt.exam.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/accounting")
public class AccountingLineController {

    @Autowired
    AccountService accountService;

    @Autowired
    ValidatorService validatorService;

    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public AccountingLine convertFromXMLToAccountingLine(@Valid @RequestBody AccountingLineXYZ accountingLineXYZ, BindingResult bindingResult) throws Exception {
        Map<String, String> errorMap = validatorService.validate(bindingResult);
        if (!errorMap.isEmpty()) {
            String errorMessage = "";
            for (Map.Entry<String, String> map: errorMap.entrySet()) {
                errorMessage += map.getKey() + ": " + map.getValue() + "\n";
            }
            throw new AccountingException(errorMessage);
        }
        return accountService.convertXMLToAccountingLineObject(accountingLineXYZ);
    }
}
