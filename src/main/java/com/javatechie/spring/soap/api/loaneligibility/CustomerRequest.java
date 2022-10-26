//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.10.24 às 09:24:13 AM BRT 
//


package com.javatechie.spring.soap.api.loaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "customerName",
    "age",
    "yearlyIncome",
    "cibilScore",
    "employmentMode",
    "amount"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected int cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;
    protected long amount;

    /**
     * Obtém o valor da propriedade customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define o valor da propriedade customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtém o valor da propriedade age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade yearlyIncome.
     * 
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Define o valor da propriedade yearlyIncome.
     * 
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Obtém o valor da propriedade cibilScore.
     * 
     */
    public int getCibilScore() {
        return cibilScore;
    }

    /**
     * Define o valor da propriedade cibilScore.
     * 
     */
    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    /**
     * Obtém o valor da propriedade employmentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Define o valor da propriedade employmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

    /**
     * Obtém o valor da propriedade amount.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Define o valor da propriedade amount.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

}
