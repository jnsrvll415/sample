package com.cwt.exam.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingLine.XYZ", propOrder = {
        "typeIndicator",
        "fareApplication",
        "formOfPaymentCode",
        "linkCode",
        "accountingVendorCode",
        "chargeCategoryCoded",
        "airlineDesignator",
        "documentNumber",
        "commissionPercentage",
        "commissionAmount",
        "baseFare",
        "basePercent",
        "taxPercentage",
        "taxAmount",
        "taxSurchargeCode2",
        "gstCode",
        "gstAmount",
        "gstPercent",
        "qstCode",
        "qstAmount",
        "qstPercent",
        "creditCardNumber",
        "creditCardCode",
        "passengerName",
        "numberOfConjunctedDocuments",
        "numberOfCoupons",
        "originalTicketNumber",
        "originalDateOfIssue",
        "originalPlaceOfIssue",
        "fullPartialExchangeIndicator",
        "originalInvoice",
        "tarriffBasis",
        "freeFormText",
        "currencyCode",
        "segmentType",
        "segmentNumber"
})
public class AccountingLineXYZ
        implements Serializable
{

    @JacksonXmlProperty(localName  = "TypeIndicator")
    @NotBlank(message = "{accounting.typeIndicator.blank}")
    protected String typeIndicator;
    @JacksonXmlProperty(localName = "FareApplication")
    @NotBlank(message = "{accounting.fareApplication.blank}")
    protected String fareApplication;
    @JacksonXmlProperty(localName = "FormOfPaymentCode")
    @NotBlank(message = "{accounting.formOfPaymentCode.blank}")
    protected String formOfPaymentCode;
    @JacksonXmlProperty(localName = "LinkCode")
    @NotBlank(message = "{accounting.linkCode.blank}")
    protected String linkCode;
    @JacksonXmlProperty(localName = "AccountingVendorCode")
    @NotBlank(message = "{accounting.accountingVendorCode.blank}")
    protected String accountingVendorCode;
    @JacksonXmlProperty(localName = "ChargeCategoryCoded")
    @NotBlank(message = "{accounting.chargeCategoryCoded.blank}")
    protected String chargeCategoryCoded;
    @JacksonXmlProperty(localName = "AirlineDesignator")
    @NotBlank(message = "{accounting.airlineDesignator.blank}")
    protected String airlineDesignator;
    @JacksonXmlProperty(localName = "DocumentNumber")
    @NotBlank(message = "{accounting.documentNumber.blank}")
    protected String documentNumber;
    @JacksonXmlProperty(localName = "CommissionPercentage")
    @NotBlank(message = "{accounting.commissionPercentage.blank}")
    protected String commissionPercentage;
    @JacksonXmlProperty(localName = "CommissionAmount")
    @NotBlank(message = "{accounting.commissionAmount.blank}")
    protected String commissionAmount;
    @JacksonXmlProperty(localName = "BaseFare")
    @NotBlank(message = "{accounting.baseFare.blank}")
    protected String baseFare;
    @JacksonXmlProperty(localName = "BasePercent")
    protected String basePercent;
    @JacksonXmlProperty(localName = "TaxPercentage")
    @NotBlank(message = "{accounting.taxPercentage.blank}")
    protected String taxPercentage;
    @JacksonXmlProperty(localName = "TaxAmount")
    @NotBlank(message = "{accounting.taxAmount.blank}")
    protected String taxAmount;
    @JacksonXmlProperty(localName = "TaxSurchargeCode2")
    @NotBlank(message = "{accounting.taxSurchargeCode2.blank}")
    protected String taxSurchargeCode2;
    @JacksonXmlProperty(localName = "GSTCode")
    @NotBlank(message = "{accounting.gstCode.blank}")
    protected String gstCode;
    @JacksonXmlProperty(localName = "GSTAmount")
    @NotBlank(message = "{accounting.gstAmount.blank}")
    protected String gstAmount;
    @JacksonXmlProperty(localName = "GSTPercent")
    @NotBlank(message = "{accounting.gstPercent.blank}")
    protected String gstPercent;
    @JacksonXmlProperty(localName = "QSTCode")
    @NotBlank(message = "{accounting.qstCode.blank}")
    protected String qstCode;
    @JacksonXmlProperty(localName = "QSTAmount")
    @NotBlank(message = "{accounting.qstAmount.blank}")
    protected String qstAmount;
    @JacksonXmlProperty(localName = "QSTPercent")
    @NotBlank(message = "{accounting.qstPercent.blank}")
    protected String qstPercent;
    @JacksonXmlProperty(localName = "CreditCardNumber")
    @NotBlank(message = "{accounting.creditCardNumber.blank}")
    protected String creditCardNumber;
    @JacksonXmlProperty(localName = "CreditCardCode")
    @NotBlank(message = "{accounting.creditCardCode.blank}")
    protected String creditCardCode;
    @JacksonXmlProperty(localName = "PassengerName")
    @NotBlank(message = "{accounting.passengerName.blank}")
    protected String passengerName;
    @JacksonXmlProperty(localName = "NumberOfConjunctedDocuments")
    @NotBlank(message = "{accounting.numberOfConjunctedDocuments.blank}")
    protected String numberOfConjunctedDocuments;
    @JacksonXmlProperty(localName = "NumberOfCoupons")
    @NotBlank(message = "{accounting.numberOfCoupons.blank}")
    protected String numberOfCoupons;
    @JacksonXmlProperty(localName = "OriginalTicketNumber")
    @NotBlank(message = "{accounting.originalTicketNumber.blank}")
    protected String originalTicketNumber;
    @JacksonXmlProperty(localName = "OriginalDateOfIssue")
    @NotBlank(message = "{accounting.originalDateOfIssue.blank}")
    protected String originalDateOfIssue;
    @JacksonXmlProperty(localName = "OriginalPlaceOfIssue")
    @NotBlank(message = "{accounting.originalPlaceOfIssue.blank}")
    protected String originalPlaceOfIssue;
    @JacksonXmlProperty(localName = "FullPartialExchangeIndicator")
    @NotBlank(message = "{accounting.fullPartialExchangeIndicator.blank}")
    protected String fullPartialExchangeIndicator;
    @JacksonXmlProperty(localName = "OriginalInvoice")
    @NotBlank(message = "{accounting.originalInvoice.blank}")
    protected String originalInvoice;
    @JacksonXmlProperty(localName = "TarriffBasis")
    @NotBlank(message = "{accounting.tarriffBasis.blank}")
    protected String tarriffBasis;
    @JacksonXmlProperty(localName = "FreeFormText")
    @NotBlank(message = "{accounting.freeFormText.blank}")
    protected String freeFormText;
    @JacksonXmlProperty(localName = "CurrencyCode")
    @NotBlank(message = "{accounting.currencyCode.blank}")
    protected String currencyCode;
    @JacksonXmlProperty(localName = "SegmentType")
    @NotBlank(message = "{accounting.segmentType.blank}")
    protected String segmentType;
    @JacksonXmlProperty(localName = "SegmentNumber")
    @NotBlank(message = "{accounting.segmentNumber.blank}")
    protected String segmentNumber;
    @JacksonXmlProperty(isAttribute = true, localName = "id")
    @NotBlank(message = "{accounting.id.blank}")
    protected String id;
    @JacksonXmlProperty(isAttribute = true, localName = "index")
    @NotNull(message = "{accounting.index.null}")
    protected Integer index;
    @JacksonXmlProperty(isAttribute = true, localName = "elementId")
    @NotBlank(message = "{accounting.elementId.blank}")
    protected String elementId;

    /**
     * Gets the value of the typeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeIndicator()
    {
        return typeIndicator;
    }

    /**
     * Sets the value of the typeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeIndicator(String value)
    {
        this.typeIndicator = value;
    }

    /**
     * Gets the value of the fareApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareApplication()
    {
        return fareApplication;
    }

    /**
     * Sets the value of the fareApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareApplication(String value)
    {
        this.fareApplication = value;
    }

    /**
     * Gets the value of the formOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentCode()
    {
        return formOfPaymentCode;
    }

    /**
     * Sets the value of the formOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentCode(String value)
    {
        this.formOfPaymentCode = value;
    }

    /**
     * Gets the value of the linkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode()
    {
        return linkCode;
    }

    /**
     * Sets the value of the linkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value)
    {
        this.linkCode = value;
    }

    /**
     * Gets the value of the accountingVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingVendorCode()
    {
        return accountingVendorCode;
    }

    /**
     * Sets the value of the accountingVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingVendorCode(String value)
    {
        this.accountingVendorCode = value;
    }

    /**
     * Gets the value of the chargeCategoryCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCategoryCoded()
    {
        return chargeCategoryCoded;
    }

    /**
     * Sets the value of the chargeCategoryCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCategoryCoded(String value)
    {
        this.chargeCategoryCoded = value;
    }

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator()
    {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value)
    {
        this.airlineDesignator = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber()
    {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value)
    {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the commissionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPercentage()
    {
        return commissionPercentage;
    }

    /**
     * Sets the value of the commissionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPercentage(String value)
    {
        this.commissionPercentage = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAmount()
    {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAmount(String value)
    {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare()
    {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value)
    {
        this.baseFare = value;
    }

    /**
     * Gets the value of the basePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePercent()
    {
        return basePercent;
    }

    /**
     * Sets the value of the basePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePercent(String value)
    {
        this.basePercent = value;
    }

    /**
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPercentage()
    {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPercentage(String value)
    {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount()
    {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value)
    {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxSurchargeCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxSurchargeCode2()
    {
        return taxSurchargeCode2;
    }

    /**
     * Sets the value of the taxSurchargeCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxSurchargeCode2(String value)
    {
        this.taxSurchargeCode2 = value;
    }

    /**
     * Gets the value of the gstCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTCode()
    {
        return gstCode;
    }

    /**
     * Sets the value of the gstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTCode(String value)
    {
        this.gstCode = value;
    }

    /**
     * Gets the value of the gstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTAmount()
    {
        return gstAmount;
    }

    /**
     * Sets the value of the gstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTAmount(String value)
    {
        this.gstAmount = value;
    }

    /**
     * Gets the value of the gstPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTPercent()
    {
        return gstPercent;
    }

    /**
     * Sets the value of the gstPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTPercent(String value)
    {
        this.gstPercent = value;
    }

    /**
     * Gets the value of the qstCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTCode()
    {
        return qstCode;
    }

    /**
     * Sets the value of the qstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTCode(String value)
    {
        this.qstCode = value;
    }

    /**
     * Gets the value of the qstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTAmount()
    {
        return qstAmount;
    }

    /**
     * Sets the value of the qstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTAmount(String value)
    {
        this.qstAmount = value;
    }

    /**
     * Gets the value of the qstPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTPercent()
    {
        return qstPercent;
    }

    /**
     * Sets the value of the qstPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTPercent(String value)
    {
        this.qstPercent = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value)
    {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCode()
    {
        return creditCardCode;
    }

    /**
     * Sets the value of the creditCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCode(String value)
    {
        this.creditCardCode = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName()
    {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value)
    {
        this.passengerName = value;
    }

    /**
     * Gets the value of the numberOfConjunctedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfConjunctedDocuments()
    {
        return numberOfConjunctedDocuments;
    }

    /**
     * Sets the value of the numberOfConjunctedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfConjunctedDocuments(String value)
    {
        this.numberOfConjunctedDocuments = value;
    }

    /**
     * Gets the value of the numberOfCoupons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfCoupons()
    {
        return numberOfCoupons;
    }

    /**
     * Sets the value of the numberOfCoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfCoupons(String value)
    {
        this.numberOfCoupons = value;
    }

    /**
     * Gets the value of the originalTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketNumber()
    {
        return originalTicketNumber;
    }

    /**
     * Sets the value of the originalTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTicketNumber(String value)
    {
        this.originalTicketNumber = value;
    }

    /**
     * Gets the value of the originalDateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDateOfIssue()
    {
        return originalDateOfIssue;
    }

    /**
     * Sets the value of the originalDateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDateOfIssue(String value)
    {
        this.originalDateOfIssue = value;
    }

    /**
     * Gets the value of the originalPlaceOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPlaceOfIssue()
    {
        return originalPlaceOfIssue;
    }

    /**
     * Sets the value of the originalPlaceOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPlaceOfIssue(String value)
    {
        this.originalPlaceOfIssue = value;
    }

    /**
     * Gets the value of the fullPartialExchangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPartialExchangeIndicator()
    {
        return fullPartialExchangeIndicator;
    }

    /**
     * Sets the value of the fullPartialExchangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPartialExchangeIndicator(String value)
    {
        this.fullPartialExchangeIndicator = value;
    }

    /**
     * Gets the value of the originalInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoice()
    {
        return originalInvoice;
    }

    /**
     * Sets the value of the originalInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoice(String value)
    {
        this.originalInvoice = value;
    }

    /**
     * Gets the value of the tarriffBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarriffBasis()
    {
        return tarriffBasis;
    }

    /**
     * Sets the value of the tarriffBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarriffBasis(String value)
    {
        this.tarriffBasis = value;
    }

    /**
     * Gets the value of the freeFormText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormText()
    {
        return freeFormText;
    }

    /**
     * Sets the value of the freeFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormText(String value)
    {
        this.freeFormText = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value)
    {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentType()
    {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentType(String value)
    {
        this.segmentType = value;
    }

    /**
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNumber()
    {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNumber(String value)
    {
        this.segmentNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex()
    {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value)
    {
        this.index = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId()
    {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value)
    {
        this.elementId = value;
    }

}
