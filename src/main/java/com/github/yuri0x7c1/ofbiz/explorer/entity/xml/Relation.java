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
 *         &lt;element ref="{}key-map" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.relation"/>
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
    "keyMap"
})
@XmlRootElement(name = "relation")
public class Relation {

	public static final String TYPE_ONE = "one";
	public static final String TYPE_ONE_NOFK = "one-nofk";
	public static final String TYPE_MANY = "many";

    protected String description;
    @XmlElement(name = "key-map", required = true)
    protected List<KeyMap> keyMap;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "rel-entity-name", required = true)
    protected String relEntityName;
    @XmlAttribute(name = "fk-name")
    protected String fkName;

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
     * Gets the value of the keyMap property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyMap property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyMap().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyMap }
     *
     *
     */
    public List<KeyMap> getKeyMap() {
        if (keyMap == null) {
            keyMap = new ArrayList<KeyMap>();
        }
        return this.keyMap;
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
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the relEntityName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRelEntityName() {
        return relEntityName;
    }

    /**
     * Sets the value of the relEntityName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRelEntityName(String value) {
        this.relEntityName = value;
    }

    /**
     * Gets the value of the fkName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFkName() {
        return fkName;
    }

    /**
     * Sets the value of the fkName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFkName(String value) {
        this.fkName = value;
    }

}
