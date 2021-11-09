package io.openraven.magpie.data.gcp.container;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ContainerAnalysisNote.TABLE_NAME)
public class ContainerAnalysisNote extends GCPResource {

    protected static final String TABLE_NAME = "gcpcontaineranalysisnote";
    public static final String RESOURCE_TYPE = "GCP::ContainerAnalysis::Note";

    public ContainerAnalysisNote() {
        this.resourceType = RESOURCE_TYPE;
    }
}
