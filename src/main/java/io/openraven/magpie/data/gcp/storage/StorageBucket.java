package io.openraven.magpie.data.gcp.storage;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = StorageBucket.TABLE_NAME)
public class StorageBucket extends GCPResource {

    protected static final String TABLE_NAME = "gcpstoragebucket";
    public static final String RESOURCE_TYPE = "GCP::Storage::Bucket";

    public StorageBucket() {
        this.resourceType = RESOURCE_TYPE;
    }
}
