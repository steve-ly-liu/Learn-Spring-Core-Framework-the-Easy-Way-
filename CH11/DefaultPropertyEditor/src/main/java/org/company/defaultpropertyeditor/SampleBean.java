package org.company.defaultpropertyeditor;

import java.net.URL;
import java.util.Currency;

public class SampleBean {
    private Integer integerVal;
    private Double doubleVal;
    private Character characterVal;
    private String stringVal;
    private Currency currencyVal;
    private URL urlVal;

    public SampleBean(Integer integerVal, Double doubleVal,  Character characterVal, String stringVal,
                      Currency currencyVal, URL urlVal) {
        this.integerVal = integerVal;
        this.doubleVal = doubleVal;
        this.characterVal = characterVal;
        this.stringVal = stringVal;
        this.currencyVal = currencyVal;
        this.urlVal = urlVal;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " : [ integerVal = " + integerVal + ", doubleVal = " + doubleVal
                + ", doubleVal = " + doubleVal + ", characterVal = " + characterVal + ", stringVal = " + stringVal
                + ", currencyVal = " + currencyVal + ", urlVal = " + urlVal + " ]";
    }
}
