
package com.interview.example.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="pCaptcha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pCaptcha"
})
@XmlRootElement(name = "SprawdzCaptcha", namespace = "http://CIS/BIR/2014/07")
public class SprawdzCaptcha {

    @XmlElementRef(name = "pCaptcha", namespace = "http://CIS/BIR/2014/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pCaptcha;

    /**
     * Gets the value of the pCaptcha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPCaptcha() {
        return pCaptcha;
    }

    /**
     * Sets the value of the pCaptcha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPCaptcha(JAXBElement<String> value) {
        this.pCaptcha = ((JAXBElement<String> ) value);
    }

}
