
package org.iata.cargo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Rating details
 * 
 * This class was generated by OWL2Java 0.14.1
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Rating)
public class Rating
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Rate, charge, or discount amount
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_rateChargeAmount)
    protected Set<Value> rateChargeAmount;
    /**
     * Subtotal of weight and valuation charges for the piece group
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_subTotalAmount)
    protected Set<Value> subTotalAmount;
    /**
     * Commodity identifier on which the rate class code is applied
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_commodityItemNumber)
    protected Set<String> commodityItemNumber;
    /**
     * Bulk or containerized (BLK or ULD) indicator
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_loadTypeCode_A)
    protected Set<String> loadTypeCode;
    /**
     * Basis on which the Rate Class Code is applicable
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rateClassBasis)
    protected Set<String> rateClassBasis;
    /**
     * Rate category code. Refer  CXML Code List 1.4,  e.g. Q - Quantity Rate
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rateClassCode)
    protected Set<String> rateClassCode;
    /**
     * Code to indicate the applicable rate
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rateReferenceCode)
    protected Set<String> rateReferenceCode;
    /**
     * Type of rate - e.g. contract, adhoc, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rateReferenceType)
    protected Set<String> rateReferenceType;
    /**
     * Rating class percentage
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ratingClassPercentage)
    protected Set<BigDecimal> ratingClassPercentage;
    /**
     * Transportation rating type - e.g. F for Face, P for Published, or rdf:type for Actual Rating detail
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ratingTypeIndicator)
    protected Set<String> ratingTypeIndicator;
    /**
     * City code of Rate Combination Point (RCP), the point over which sector rates are combined
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rcp)
    protected Set<BigDecimal> rcp;
    /**
     * Unit Load Device rate class type e.g. 1P
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_uldRateClassType)
    protected Set<String> uldRateClassType;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("Rating {"+ name)+"<")+ id)+">")+"}");
    }

    public void setRateChargeAmount(Set<Value> rateChargeAmount) {
        this.rateChargeAmount = rateChargeAmount;
    }

    public Set<Value> getRateChargeAmount() {
        return rateChargeAmount;
    }

    public void setSubTotalAmount(Set<Value> subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }

    public Set<Value> getSubTotalAmount() {
        return subTotalAmount;
    }

    public void setCommodityItemNumber(Set<String> commodityItemNumber) {
        this.commodityItemNumber = commodityItemNumber;
    }

    public Set<String> getCommodityItemNumber() {
        return commodityItemNumber;
    }

    public void setLoadTypeCode(Set<String> loadTypeCode) {
        this.loadTypeCode = loadTypeCode;
    }

    public Set<String> getLoadTypeCode() {
        return loadTypeCode;
    }

    public void setRateClassBasis(Set<String> rateClassBasis) {
        this.rateClassBasis = rateClassBasis;
    }

    public Set<String> getRateClassBasis() {
        return rateClassBasis;
    }

    public void setRateClassCode(Set<String> rateClassCode) {
        this.rateClassCode = rateClassCode;
    }

    public Set<String> getRateClassCode() {
        return rateClassCode;
    }

    public void setRateReferenceCode(Set<String> rateReferenceCode) {
        this.rateReferenceCode = rateReferenceCode;
    }

    public Set<String> getRateReferenceCode() {
        return rateReferenceCode;
    }

    public void setRateReferenceType(Set<String> rateReferenceType) {
        this.rateReferenceType = rateReferenceType;
    }

    public Set<String> getRateReferenceType() {
        return rateReferenceType;
    }

    public void setRatingClassPercentage(Set<BigDecimal> ratingClassPercentage) {
        this.ratingClassPercentage = ratingClassPercentage;
    }

    public Set<BigDecimal> getRatingClassPercentage() {
        return ratingClassPercentage;
    }

    public void setRatingTypeIndicator(Set<String> ratingTypeIndicator) {
        this.ratingTypeIndicator = ratingTypeIndicator;
    }

    public Set<String> getRatingTypeIndicator() {
        return ratingTypeIndicator;
    }

    public void setRcp(Set<BigDecimal> rcp) {
        this.rcp = rcp;
    }

    public Set<BigDecimal> getRcp() {
        return rcp;
    }

    public void setUldRateClassType(Set<String> uldRateClassType) {
        this.uldRateClassType = uldRateClassType;
    }

    public Set<String> getUldRateClassType() {
        return uldRateClassType;
    }

}
