
package org.test;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SampleRequestResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="string3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sampleRequestResult",
    "string3"
})
@XmlRootElement(name = "SampleRequestResponse")
public class SampleRequestResponse {

    @XmlElement(name = "SampleRequestResult")
    protected boolean sampleRequestResult;
    protected String string3;

    /**
     * Gets the value of the sampleRequestResult property.
     * 
     */
    public boolean isSampleRequestResult() {
        return sampleRequestResult;
    }

    /**
     * Sets the value of the sampleRequestResult property.
     * 
     */
    public void setSampleRequestResult(boolean value) {
        this.sampleRequestResult = value;
    }

    /**
     * Gets the value of the string3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Sets the value of the string3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

}
