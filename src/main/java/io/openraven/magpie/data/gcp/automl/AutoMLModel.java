package io.openraven.magpie.data.gcp.automl;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = AutoMLModel.TABLE_NAME)
public class AutoMLModel extends GCPResource {

    protected static final String TABLE_NAME = "gcpautomlmodel";
    public static final String RESOURCE_TYPE = "GCP::AutoML::Model";

    public AutoMLModel() {
        this.resourceType = RESOURCE_TYPE;
    }
}
