package io.openraven.magpie.data.gcp.automl;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = AutoMLDataset.TABLE_NAME)
public class AutoMLDataset extends GCPResource {

    protected static final String TABLE_NAME = "gcpautomldataset";
    public static final String RESOURCE_TYPE = "GCP::AutoML::Dataset";

    public AutoMLDataset() {
        this.resourceType = RESOURCE_TYPE;
    }
}
