package com.cwt.exam.service;

import com.cwt.exam.dto.AccountingLine;
import com.cwt.exam.dto.AccountingLineXYZ;

public interface AccountService {

    AccountingLine convertXMLToAccountingLineObject(AccountingLineXYZ accountingLineXYZ) throws Exception;
}
