package io.openraven.magpie.data.gcp.compute;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ComputeInstance.TABLE_NAME)
public class ComputeInstance extends GCPResource {

    protected static final String TABLE_NAME = "gcpcomputeinstance";
    public static final String RESOURCE_TYPE = "GCP::ComputeEngine::Instance";

    public ComputeInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
