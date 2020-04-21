
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
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Unit Load Device details
 * 
 * This class was generated by OWL2Java 0.14.1
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Uld)
public class Uld
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
     * Details of contained (virtual) piece(s)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedPiece_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Piece> containedPiece;
    /**
     * Event details e.g. DEP, ARR, FOH, RCS, security screening, etc
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_event_A_A)
    protected Set<Event> event;
    /**
     * Reference documents details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_externalReference_A_A_A_A_A)
    protected Set<ExternalReference> externalReference;
    /**
     * Handling details  
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_handlingDetails_A_A)
    protected Set<Handling> handlingDetails;
    /**
     * Origin and destination details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_originDestination_A_A)
    protected Set<TransportSegment> originDestination;
    /**
     * Owner company details and contacts for the ULD
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_ownerCompany)
    protected Set<Company> ownerCompany;
    /**
     * Tare weight of the empty ULD
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_tareWeight)
    protected Set<Value> tareWeight;
    /**
     * Segment related to the transport status
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportSegment_A)
    protected Set<TransportSegment> transportSegment;
    /**
     * US / ATA Unit Load Device type code e.g. M2
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_aTAdesignator)
    protected Set<String> aTAdesignator;
    /**
     * Number of contained pieces 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_containedPieceCount_A)
    protected Set<BigDecimal> containedPieceCount;
    /**
     * ULD height or loading limitation code. Refer CXML Code List 1.47,  e.g. R - ULD Height above 244 centimetres
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_loadingIndicator)
    protected Set<String> loadingIndicator;
    /**
     * Owner code of the ULD in aa, an or na format - owner can be an airline or leasing company
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ownerCode)
    protected Set<String> ownerCode;
    /**
     * Issuer of the ULD owner code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ownerCodeIssuer)
    protected Set<String> ownerCodeIssuer;
    /**
     * Shipper's Load And Count  ( total contained piece count as provided by shipper)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sLAC_A)
    protected Set<BigDecimal> sLAC;
    /**
     * ULD serial number
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_serialNumber)
    protected Set<String> serialNumber;
    /**
     * Standard Unit Load Device type code e.g. AKE - Certified Container - Contoured
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_type_A_A_A_A_A)
    protected Set<String> type;

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
        return ((((("Uld {"+ name)+"<")+ id)+">")+"}");
    }

    public void setContainedPiece(Set<Piece> containedPiece) {
        this.containedPiece = containedPiece;
    }

    public Set<Piece> getContainedPiece() {
        return containedPiece;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setExternalReference(Set<ExternalReference> externalReference) {
        this.externalReference = externalReference;
    }

    public Set<ExternalReference> getExternalReference() {
        return externalReference;
    }

    public void setHandlingDetails(Set<Handling> handlingDetails) {
        this.handlingDetails = handlingDetails;
    }

    public Set<Handling> getHandlingDetails() {
        return handlingDetails;
    }

    public void setOriginDestination(Set<TransportSegment> originDestination) {
        this.originDestination = originDestination;
    }

    public Set<TransportSegment> getOriginDestination() {
        return originDestination;
    }

    public void setOwnerCompany(Set<Company> ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public Set<Company> getOwnerCompany() {
        return ownerCompany;
    }

    public void setTareWeight(Set<Value> tareWeight) {
        this.tareWeight = tareWeight;
    }

    public Set<Value> getTareWeight() {
        return tareWeight;
    }

    public void setTransportSegment(Set<TransportSegment> transportSegment) {
        this.transportSegment = transportSegment;
    }

    public Set<TransportSegment> getTransportSegment() {
        return transportSegment;
    }

    public void setATAdesignator(Set<String> aTAdesignator) {
        this.aTAdesignator = aTAdesignator;
    }

    public Set<String> getATAdesignator() {
        return aTAdesignator;
    }

    public void setContainedPieceCount(Set<BigDecimal> containedPieceCount) {
        this.containedPieceCount = containedPieceCount;
    }

    public Set<BigDecimal> getContainedPieceCount() {
        return containedPieceCount;
    }

    public void setLoadingIndicator(Set<String> loadingIndicator) {
        this.loadingIndicator = loadingIndicator;
    }

    public Set<String> getLoadingIndicator() {
        return loadingIndicator;
    }

    public void setOwnerCode(Set<String> ownerCode) {
        this.ownerCode = ownerCode;
    }

    public Set<String> getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCodeIssuer(Set<String> ownerCodeIssuer) {
        this.ownerCodeIssuer = ownerCodeIssuer;
    }

    public Set<String> getOwnerCodeIssuer() {
        return ownerCodeIssuer;
    }

    public void setSLAC(Set<BigDecimal> sLAC) {
        this.sLAC = sLAC;
    }

    public Set<BigDecimal> getSLAC() {
        return sLAC;
    }

    public void setSerialNumber(Set<String> serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Set<String> getSerialNumber() {
        return serialNumber;
    }

    public void setType(Set<String> type) {
        this.type = type;
    }

    public Set<String> getType() {
        return type;
    }

}
