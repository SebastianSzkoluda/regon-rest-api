
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
 *         &lt;element name="SprawdzCaptchaResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "sprawdzCaptchaResult"
})
@XmlRootElement(name = "SprawdzCaptchaResponse", namespace = "http://CIS/BIR/2014/07")
public class SprawdzCaptchaResponse {

    @XmlElement(name = "SprawdzCaptchaResult", namespace = "http://CIS/BIR/2014/07")
    protected Boolean sprawdzCaptchaResult;

    /**
     * Gets the value of the sprawdzCaptchaResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprawdzCaptchaResult() {
        return sprawdzCaptchaResult;
    }

    /**
     * Sets the value of the sprawdzCaptchaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprawdzCaptchaResult(Boolean value) {
        this.sprawdzCaptchaResult = value;
    }

}
