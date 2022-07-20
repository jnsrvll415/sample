package com.cwt.exam.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAmount implements Serializable
{
    private static final long serialVersionUID = 6498027380354019510L;


    private String formattedValue;

    private String currencyCode;

    private Long value;

    private Integer numberOfDecimals;

    public String getFormattedValue() {
        return formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Integer getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public void setNumberOfDecimals(Integer numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }
}
