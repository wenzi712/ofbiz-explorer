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
 *         &lt;element ref="{}exclude" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.alias-all"/>
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
    "exclude"
})
@XmlRootElement(name = "alias-all")
public class AliasAll {

    protected String description;
    protected List<Exclude> exclude;
    @XmlAttribute(name = "entity-alias", required = true)
    protected String entityAlias;
    @XmlAttribute(name = "prefix")
    protected String prefix;
    @XmlAttribute(name = "group-by")
    protected Boolean groupBy;
    @XmlAttribute(name = "function")
    protected AggregateFunction function;
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
     * Gets the value of the exclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exclude }
     * 
     * 
     */
    public List<Exclude> getExclude() {
        if (exclude == null) {
            exclude = new ArrayList<Exclude>();
        }
        return this.exclude;
    }

    /**
     * Gets the value of the entityAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityAlias() {
        return entityAlias;
    }

    /**
     * Sets the value of the entityAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityAlias(String value) {
        this.entityAlias = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGroupBy() {
        if (groupBy == null) {
            return Boolean.FALSE;
        } else {
            return groupBy;
        }
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupBy(Boolean value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateFunction }
     *     
     */
    public AggregateFunction getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateFunction }
     *     
     */
    public void setFunction(AggregateFunction value) {
        this.function = value;
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
