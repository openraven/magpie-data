package io.openraven.magpie.data.gcp.container;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ContainerAnalysisOccurrence.TABLE_NAME)
public class ContainerAnalysisOccurrence extends GCPResource {

    protected static final String TABLE_NAME = "gcpcontaineranalysisoccurrence";
    public static final String RESOURCE_TYPE = "GCP::ContainerAnalysis::Occurrence";

    public ContainerAnalysisOccurrence() {
        this.resourceType = RESOURCE_TYPE;
    }
}
