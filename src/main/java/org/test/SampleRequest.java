
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
 *         &lt;element name="Number1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="string2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "number1",
    "string2",
    "string3"
})
@XmlRootElement(name = "SampleRequest")
public class SampleRequest {

    @XmlElement(name = "Number1")
    protected int number1;
    protected String string2;
    protected String string3;

    /**
     * Gets the value of the number1 property.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the string2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Sets the value of the string2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
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
