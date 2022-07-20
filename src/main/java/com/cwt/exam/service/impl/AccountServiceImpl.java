package com.cwt.exam.service.impl;

import com.cwt.exam.dto.AccountingLine;
import com.cwt.exam.dto.AccountingLineStatus;
import com.cwt.exam.dto.AccountingLineXYZ;
import com.cwt.exam.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    @Override
    public AccountingLine convertXMLToAccountingLineObject(AccountingLineXYZ accountingLineXYZ) throws Exception {
        AccountingLine accountingLine = new AccountingLine(accountingLineXYZ);
        if (accountingLine != null) {
            accountingLine.setAccountingLineStatus(AccountingLineStatus.ACTIVE);
        }
        return accountingLine;
    }

}
