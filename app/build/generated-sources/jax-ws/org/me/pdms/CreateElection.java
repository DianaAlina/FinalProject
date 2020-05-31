
package org.me.pdms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createElection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createElection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="can1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="can2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="can3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="can4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createElection", propOrder = {
    "description",
    "can1",
    "can2",
    "can3",
    "can4",
    "status"
})
public class CreateElection {

    protected String description;
    protected String can1;
    protected String can2;
    protected String can3;
    protected String can4;
    protected String status;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the can1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCan1() {
        return can1;
    }

    /**
     * Sets the value of the can1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCan1(String value) {
        this.can1 = value;
    }

    /**
     * Gets the value of the can2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCan2() {
        return can2;
    }

    /**
     * Sets the value of the can2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCan2(String value) {
        this.can2 = value;
    }

    /**
     * Gets the value of the can3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCan3() {
        return can3;
    }

    /**
     * Sets the value of the can3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCan3(String value) {
        this.can3 = value;
    }

    /**
     * Gets the value of the can4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCan4() {
        return can4;
    }

    /**
     * Sets the value of the can4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCan4(String value) {
        this.can4 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
