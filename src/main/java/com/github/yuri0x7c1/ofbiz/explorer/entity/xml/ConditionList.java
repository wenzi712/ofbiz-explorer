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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}condition-expr"/>
 *         &lt;element ref="{}condition-list"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}attlist.condition-list"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionExprOrConditionList"
})
@XmlRootElement(name = "condition-list")
public class ConditionList {

    @XmlElements({
        @XmlElement(name = "condition-expr", type = ConditionExpr.class),
        @XmlElement(name = "condition-list", type = ConditionList.class)
    })
    protected List<Object> conditionExprOrConditionList;
    @XmlAttribute(name = "combine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String combine;

    /**
     * Gets the value of the conditionExprOrConditionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionExprOrConditionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionExprOrConditionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionExpr }
     * {@link ConditionList }
     * 
     * 
     */
    public List<Object> getConditionExprOrConditionList() {
        if (conditionExprOrConditionList == null) {
            conditionExprOrConditionList = new ArrayList<Object>();
        }
        return this.conditionExprOrConditionList;
    }

    /**
     * Gets the value of the combine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombine() {
        if (combine == null) {
            return "and";
        } else {
            return combine;
        }
    }

    /**
     * Sets the value of the combine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombine(String value) {
        this.combine = value;
    }

}
