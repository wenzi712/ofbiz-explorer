//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.03 at 04:24:07 PM EEST 
//


package com.github.yuri0x7c1.ofbiz.explorer.service.xml;

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
 *       &lt;sequence>
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element ref="{}namespace" minOccurs="0"/>
 *         &lt;element ref="{}permission-service" minOccurs="0"/>
 *         &lt;element ref="{}required-permissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}implements" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}metric" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{}auto-attributes"/>
 *             &lt;element ref="{}attribute"/>
 *           &lt;/choice>
 *           &lt;element ref="{}group"/>
 *         &lt;/choice>
 *         &lt;element ref="{}override" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.service"/>
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
    "namespace",
    "permissionService",
    "requiredPermissions",
    "_implements",
    "metric",
    "autoAttributesOrAttribute",
    "group",
    "override"
})
@XmlRootElement(name = "service")
public class Service {

    protected String description;
    protected String namespace;
    @XmlElement(name = "permission-service")
    protected PermissionService permissionService;
    @XmlElement(name = "required-permissions")
    protected List<RequiredPermissions> requiredPermissions;
    @XmlElement(name = "implements")
    protected List<Implements> _implements;
    protected Metric metric;
    @XmlElements({
        @XmlElement(name = "auto-attributes", type = AutoAttributes.class),
        @XmlElement(name = "attribute", type = Attribute.class)
    })
    protected List<Object> autoAttributesOrAttribute;
    protected Group group;
    protected List<Override> override;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "engine", required = true)
    protected String engine;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "invoke")
    protected String invoke;
    @XmlAttribute(name = "auth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String auth;
    @XmlAttribute(name = "export")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String export;
    @XmlAttribute(name = "validate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String validate;
    @XmlAttribute(name = "default-entity-name")
    protected String defaultEntityName;
    @XmlAttribute(name = "use-transaction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useTransaction;
    @XmlAttribute(name = "require-new-transaction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String requireNewTransaction;
    @XmlAttribute(name = "hideResultInLog")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hideResultInLog;
    @XmlAttribute(name = "transaction-timeout")
    protected Integer transactionTimeout;
    @XmlAttribute(name = "max-retry")
    protected Integer maxRetry;
    @XmlAttribute(name = "debug")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String debug;
    @XmlAttribute(name = "semaphore")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String semaphore;
    @XmlAttribute(name = "semaphore-wait-seconds")
    protected Integer semaphoreWaitSeconds;
    @XmlAttribute(name = "semaphore-sleep")
    protected Integer semaphoreSleep;

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
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the permissionService property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionService }
     *     
     */
    public PermissionService getPermissionService() {
        return permissionService;
    }

    /**
     * Sets the value of the permissionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionService }
     *     
     */
    public void setPermissionService(PermissionService value) {
        this.permissionService = value;
    }

    /**
     * Gets the value of the requiredPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredPermissions }
     * 
     * 
     */
    public List<RequiredPermissions> getRequiredPermissions() {
        if (requiredPermissions == null) {
            requiredPermissions = new ArrayList<RequiredPermissions>();
        }
        return this.requiredPermissions;
    }

    /**
     * Gets the value of the implements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Implements }
     * 
     * 
     */
    public List<Implements> getImplements() {
        if (_implements == null) {
            _implements = new ArrayList<Implements>();
        }
        return this._implements;
    }

    /**
     * Gets the value of the metric property.
     * 
     * @return
     *     possible object is
     *     {@link Metric }
     *     
     */
    public Metric getMetric() {
        return metric;
    }

    /**
     * Sets the value of the metric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metric }
     *     
     */
    public void setMetric(Metric value) {
        this.metric = value;
    }

    /**
     * Gets the value of the autoAttributesOrAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoAttributesOrAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoAttributesOrAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoAttributes }
     * {@link Attribute }
     * 
     * 
     */
    public List<Object> getAutoAttributesOrAttribute() {
        if (autoAttributesOrAttribute == null) {
            autoAttributesOrAttribute = new ArrayList<Object>();
        }
        return this.autoAttributesOrAttribute;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the override property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Override }
     * 
     * 
     */
    public List<Override> getOverride() {
        if (override == null) {
            override = new ArrayList<Override>();
        }
        return this.override;
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
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngine(String value) {
        this.engine = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the invoke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoke() {
        return invoke;
    }

    /**
     * Sets the value of the invoke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoke(String value) {
        this.invoke = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuth() {
        if (auth == null) {
            return "false";
        } else {
            return auth;
        }
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuth(String value) {
        this.auth = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExport() {
        if (export == null) {
            return "false";
        } else {
            return export;
        }
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExport(String value) {
        this.export = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidate() {
        if (validate == null) {
            return "true";
        } else {
            return validate;
        }
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidate(String value) {
        this.validate = value;
    }

    /**
     * Gets the value of the defaultEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEntityName() {
        return defaultEntityName;
    }

    /**
     * Sets the value of the defaultEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEntityName(String value) {
        this.defaultEntityName = value;
    }

    /**
     * Gets the value of the useTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTransaction() {
        if (useTransaction == null) {
            return "true";
        } else {
            return useTransaction;
        }
    }

    /**
     * Sets the value of the useTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTransaction(String value) {
        this.useTransaction = value;
    }

    /**
     * Gets the value of the requireNewTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireNewTransaction() {
        if (requireNewTransaction == null) {
            return "false";
        } else {
            return requireNewTransaction;
        }
    }

    /**
     * Sets the value of the requireNewTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireNewTransaction(String value) {
        this.requireNewTransaction = value;
    }

    /**
     * Gets the value of the hideResultInLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideResultInLog() {
        if (hideResultInLog == null) {
            return "false";
        } else {
            return hideResultInLog;
        }
    }

    /**
     * Sets the value of the hideResultInLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideResultInLog(String value) {
        this.hideResultInLog = value;
    }

    /**
     * Gets the value of the transactionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTransactionTimeout() {
        if (transactionTimeout == null) {
            return  0;
        } else {
            return transactionTimeout;
        }
    }

    /**
     * Sets the value of the transactionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionTimeout(Integer value) {
        this.transactionTimeout = value;
    }

    /**
     * Gets the value of the maxRetry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxRetry() {
        if (maxRetry == null) {
            return -1;
        } else {
            return maxRetry;
        }
    }

    /**
     * Sets the value of the maxRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRetry(Integer value) {
        this.maxRetry = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebug() {
        if (debug == null) {
            return "false";
        } else {
            return debug;
        }
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebug(String value) {
        this.debug = value;
    }

    /**
     * Gets the value of the semaphore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemaphore() {
        if (semaphore == null) {
            return "none";
        } else {
            return semaphore;
        }
    }

    /**
     * Sets the value of the semaphore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemaphore(String value) {
        this.semaphore = value;
    }

    /**
     * Gets the value of the semaphoreWaitSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSemaphoreWaitSeconds() {
        if (semaphoreWaitSeconds == null) {
            return  300;
        } else {
            return semaphoreWaitSeconds;
        }
    }

    /**
     * Sets the value of the semaphoreWaitSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSemaphoreWaitSeconds(Integer value) {
        this.semaphoreWaitSeconds = value;
    }

    /**
     * Gets the value of the semaphoreSleep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSemaphoreSleep() {
        if (semaphoreSleep == null) {
            return  500;
        } else {
            return semaphoreSleep;
        }
    }

    /**
     * Sets the value of the semaphoreSleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSemaphoreSleep(Integer value) {
        this.semaphoreSleep = value;
    }

}