package com.cwt.exam.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.cwt.exam.exception.AccountingException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class AccountingLine implements Serializable
{
    private static final long serialVersionUID = 8768848284389900534L;
    private static final String philippinePeso = "₱";
    private String accountingLineID;

    private AccountingLineStatus accountingLineStatus;

    private String accountingVendorCode;

    private String airlineCode;

    private String chargeCategoryCode;

    private String formattedReceiptNumber;

    private String invoiceNumber;

    private String linkCode;

    private String numberOfConjunctedDocuments;

    private String originalTicketNumber;

    private String receiptNumber;

    private List<String> segmentRefIDList;

    private String travelerName;

    private List<String> travelerRefIDList;

    private String typeIndicator;

    private String elementNumber;

    private String fareApplication;

    private MonetaryAmount baseFare;

    private MonetaryAmount taxAmount;

    private MonetaryAmount totalTaxAmount;

    private MonetaryAmount totalTaxSurcharge;

    private MonetaryAmount gstAmount;

    private String gstCode;

    private MonetaryAmount qstAmount;

    private String qstCode;

    private MonetaryPercentage commission;

    private String freeFormText;

    public String getAccountingLineID() {
        return accountingLineID;
    }

    public void setAccountingLineID(String accountingLineID) {
        this.accountingLineID = accountingLineID;
    }

    public AccountingLineStatus getAccountingLineStatus() {
        return accountingLineStatus;
    }

    public void setAccountingLineStatus(AccountingLineStatus accountingLineStatus) {
        this.accountingLineStatus = accountingLineStatus;
    }

    public String getAccountingVendorCode() {
        return accountingVendorCode;
    }

    public void setAccountingVendorCode(String accountingVendorCode) {
        this.accountingVendorCode = accountingVendorCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getChargeCategoryCode() {
        return chargeCategoryCode;
    }

    public void setChargeCategoryCode(String chargeCategoryCode) {
        this.chargeCategoryCode = chargeCategoryCode;
    }

    public String getFormattedReceiptNumber() {
        return formattedReceiptNumber;
    }

    public void setFormattedReceiptNumber(String formattedReceiptNumber) {
        this.formattedReceiptNumber = formattedReceiptNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getNumberOfConjunctedDocuments() {
        return numberOfConjunctedDocuments;
    }

    public void setNumberOfConjunctedDocuments(String numberOfConjunctedDocuments) {
        this.numberOfConjunctedDocuments = numberOfConjunctedDocuments;
    }

    public String getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    public void setOriginalTicketNumber(String originalTicketNumber) {
        this.originalTicketNumber = originalTicketNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public List<String> getSegmentRefIDList() {
        return segmentRefIDList;
    }

    public void setSegmentRefIDList(List<String> segmentRefIDList) {
        this.segmentRefIDList = segmentRefIDList;
    }

    public String getTravelerName() {
        return travelerName;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    public List<String> getTravelerRefIDList() {
        return travelerRefIDList;
    }

    public void setTravelerRefIDList(List<String> travelerRefIDList) {
        this.travelerRefIDList = travelerRefIDList;
    }

    public String getTypeIndicator() {
        return typeIndicator;
    }

    public void setTypeIndicator(String typeIndicator) {
        this.typeIndicator = typeIndicator;
    }

    public String getElementNumber() {
        return elementNumber;
    }

    public void setElementNumber(String elementNumber) {
        this.elementNumber = elementNumber;
    }

    public String getFareApplication() {
        return fareApplication;
    }

    public void setFareApplication(String fareApplication) {
        this.fareApplication = fareApplication;
    }

    public MonetaryAmount getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(MonetaryAmount baseFare) {
        this.baseFare = baseFare;
    }

    public MonetaryAmount getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(MonetaryAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

    public MonetaryAmount getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(MonetaryAmount totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public MonetaryAmount getTotalTaxSurcharge() {
        return totalTaxSurcharge;
    }

    public void setTotalTaxSurcharge(MonetaryAmount totalTaxSurcharge) {
        this.totalTaxSurcharge = totalTaxSurcharge;
    }

    public MonetaryAmount getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(MonetaryAmount gstAmount) {
        this.gstAmount = gstAmount;
    }

    public String getGstCode() {
        return gstCode;
    }

    public void setGstCode(String gstCode) {
        this.gstCode = gstCode;
    }

    public MonetaryAmount getQstAmount() {
        return qstAmount;
    }

    public void setQstAmount(MonetaryAmount qstAmount) {
        this.qstAmount = qstAmount;
    }

    public String getQstCode() {
        return qstCode;
    }

    public void setQstCode(String qstCode) {
        this.qstCode = qstCode;
    }

    public MonetaryPercentage getCommission() {
        return commission;
    }

    public void setCommission(MonetaryPercentage commission) {
        this.commission = commission;
    }

    public String getFreeFormText() {
        return freeFormText;
    }

    public void setFreeFormText(String freeFormText) {
        this.freeFormText = freeFormText;
    }

    public AccountingLine (AccountingLineXYZ accountingLineXYZ) throws Exception {
        this.accountingLineID = accountingLineXYZ.getId();
        this.accountingVendorCode = accountingLineXYZ.getAccountingVendorCode();
        this.chargeCategoryCode = accountingLineXYZ.getChargeCategoryCoded();
        this.invoiceNumber = accountingLineXYZ.getOriginalInvoice();
        this.linkCode = accountingLineXYZ.getLinkCode();
//        this.airlineCode = accountingLineXYZ.getAirlineDesignator();
        this.numberOfConjunctedDocuments = this.validateNumberOfConjunctedDocuments(accountingLineXYZ.getNumberOfConjunctedDocuments()) ? accountingLineXYZ.getNumberOfConjunctedDocuments() : "";
        this.originalTicketNumber = accountingLineXYZ.getOriginalTicketNumber();
        this.receiptNumber = accountingLineXYZ.getDocumentNumber();
//        this.segmentRefIDList = accountingLineXYZ.getSegmentNumber();
        this.travelerName = accountingLineXYZ.getPassengerName();
//        this.travelerRefIDList = 1;
        this.typeIndicator = accountingLineXYZ.getTypeIndicator();
        this.elementNumber = accountingLineXYZ.getIndex().toString();
        this.fareApplication = accountingLineXYZ.getFareApplication();

        String currencyCode = accountingLineXYZ.getCurrencyCode();
        this.baseFare = this.getMonetaryAmount(accountingLineXYZ.getBaseFare(), "Base Fare", currencyCode);
        this.taxAmount = this.getMonetaryAmount(accountingLineXYZ.getTaxAmount(), "Tax Amount", currencyCode);
        this.gstAmount = this.getMonetaryAmount(accountingLineXYZ.getGSTAmount(), "GST Amount", currencyCode);
        this.gstCode = accountingLineXYZ.getGSTCode();
        this.qstAmount = this.getMonetaryAmount(accountingLineXYZ.getQSTAmount(), "QST Amount", currencyCode);
        this.qstCode = accountingLineXYZ.getQSTCode();

        String totalTaxSurge = String.valueOf(this.gstAmount.getValue() + this.qstAmount.getValue());
        this.totalTaxSurcharge = this.getMonetaryAmount(totalTaxSurge, "Total Tax Surge", currencyCode);

        String totalTaxAmount = String.valueOf(this.totalTaxSurcharge.getValue() + this.taxAmount.getValue());
        this.totalTaxAmount = this.getMonetaryAmount(totalTaxAmount, "Total Tax Amount", currencyCode);


        this.freeFormText = accountingLineXYZ.getFreeFormText();
        this.commission = this.getMonetaryPercentage("", accountingLineXYZ.getCommissionAmount(), accountingLineXYZ.getCommissionPercentage(), "Commision", currencyCode);
    }

    public Long parseIntoLong (String input, String fieldName) throws Exception{
        try{
            Double num = Double.parseDouble(input);
            Long number = num.longValue();
            return number;
        }
        catch (NumberFormatException ex){
            String message = "Error input for " + fieldName + " because " + input + " is not a number.";
            throw new AccountingException(message);
        }
    }

    public BigDecimal parseIntoBigDecimal (String input, String fieldName) throws Exception{
        try{
            BigDecimal number = new BigDecimal(input);
            return number;
        }
        catch (NumberFormatException ex){
            String message = "Error input for " + fieldName + " because " + input + " is not a number.";
            throw new AccountingException(message);
        }
    }

    public MonetaryAmount getMonetaryAmount (String amount, String fieldName, String currencyCode) throws Exception {
        MonetaryAmount monetaryAmount = new MonetaryAmount();

        String[] splitter = amount.split("\\.");
        Long amountInLong = this.parseIntoLong(amount, fieldName);
        Integer decimalNumber = 0;

        if (splitter.length > 1) {
            decimalNumber = splitter[1].length();
        }

        String formattedValue = currencyCode + " " + Double.parseDouble(amount);
        monetaryAmount.setFormattedValue(formattedValue);
        monetaryAmount.setCurrencyCode(currencyCode);
        monetaryAmount.setValue(amountInLong);
        monetaryAmount.setNumberOfDecimals(decimalNumber);
        return monetaryAmount;
    }

    public MonetaryPercentage getMonetaryPercentage (String code, String amount, String percentage, String fieldName, String currencyCode) throws Exception{
        MonetaryPercentage monetaryPercentage = new MonetaryPercentage();
        monetaryPercentage.setCode(code);
        monetaryPercentage.setAmount(this.getMonetaryAmount(amount, fieldName, currencyCode));
        monetaryPercentage.setPercentage(this.parseIntoBigDecimal(percentage, fieldName));

        return monetaryPercentage;
    }

    public boolean validateNumberOfConjunctedDocuments (String numberOfConjunctedDocuments) throws Exception{
        boolean isNumberOfConjunctedDocumentsValid = false;
        String[] splitter = numberOfConjunctedDocuments.split("\\-");
        if (splitter.length > 1) {
            try{
                Integer num = Integer.parseInt(splitter[0]);
            }
            catch (NumberFormatException ex){
                String message = "Error input for Number Of Conjuncted Documents because " + numberOfConjunctedDocuments + " is not in the correct format: Digits-Characters";
                throw new AccountingException(message);
            }
        }

        return isNumberOfConjunctedDocumentsValid;
    }
}
