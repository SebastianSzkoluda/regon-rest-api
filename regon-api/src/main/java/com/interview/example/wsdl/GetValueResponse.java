
package com.interview.example.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetValueResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getValueResult"
})
@XmlRootElement(name = "GetValueResponse", namespace = "http://CIS/BIR/2014/07")
public class GetValueResponse {

    @XmlElement(name = "GetValueResult", namespace = "http://CIS/BIR/2014/07")
    protected String getValueResult;

    /**
     * Gets the value of the getValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetValueResult() {
        return getValueResult;
    }

    /**
     * Sets the value of the getValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetValueResult(String value) {
        this.getValueResult = value;
    }

}
