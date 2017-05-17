//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 02:28:17 PM EEST 
//


package com.github.yuri0x7c1.ofbiz.explorer.entity.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element ref="{}validate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.field"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "validate"
})
@XmlRootElement(name = "field")
public class Field {

    protected String description;
    protected List<Validate> validate;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "col-name")
    protected String colName;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "encrypt")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String encrypt;
    @XmlAttribute(name = "enable-audit-log")
    protected Boolean enableAuditLog;
    @XmlAttribute(name = "not-null")
    protected Boolean notNull;
    @XmlAttribute(name = "field-set")
    protected String fieldSet;

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
     * Gets the value of the validate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validate }
     * 
     * 
     */
    public List<Validate> getValidate() {
        if (validate == null) {
            validate = new ArrayList<Validate>();
        }
        return this.validate;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the colName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColName() {
        return colName;
    }

    /**
     * Sets the value of the colName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColName(String value) {
        this.colName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the encrypt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncrypt() {
        if (encrypt == null) {
            return "false";
        } else {
            return encrypt;
        }
    }

    /**
     * Sets the value of the encrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncrypt(String value) {
        this.encrypt = value;
    }

    /**
     * Gets the value of the enableAuditLog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnableAuditLog() {
        if (enableAuditLog == null) {
            return Boolean.FALSE;
        } else {
            return enableAuditLog;
        }
    }

    /**
     * Sets the value of the enableAuditLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAuditLog(Boolean value) {
        this.enableAuditLog = value;
    }

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNotNull() {
        if (notNull == null) {
            return Boolean.FALSE;
        } else {
            return notNull;
        }
    }

    /**
     * Sets the value of the notNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotNull(Boolean value) {
        this.notNull = value;
    }

    /**
     * Gets the value of the fieldSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldSet() {
        if (fieldSet == null) {
            return "";
        } else {
            return fieldSet;
        }
    }

    /**
     * Sets the value of the fieldSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldSet(String value) {
        this.fieldSet = value;
    }

}