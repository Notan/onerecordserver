
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;


/**
 * Logistics Object prent class, containing all common properties for logistics objects.
 * 
 * This class was generated by OWL2Java 0.14.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_LogisticsObject)
@Document(collection = "logisticsObjects")
@ApiModel
public class LogisticsObject
    implements Serializable
{

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    @JsonIgnore
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    /**
     * Events object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_event)
    @JsonProperty(Vocabulary.s_p_event)
    protected Set<Event> event;
    /**
     * Company identifier from the Internet of Logistics of the entity that hosts the Logistics Object.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_companyIdentifier)
    @JsonProperty(Vocabulary.s_p_companyIdentifier)
    protected String companyIdentifier;

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

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("LogisticsObject {"+ name)+"<")+ id)+">")+"}");
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

}
