package io.openraven.magpie.data.gcp.bigtable;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = BigTableInstance.TABLE_NAME)
public class BigTableInstance extends GCPResource {
    protected static final String TABLE_NAME = "bigtableinstance";
    public static final String RESOURCE_TYPE = "GCP::BigTable::Instance";

    public BigTableInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
