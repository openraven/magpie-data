package io.openraven.magpie.data.gcp.data;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DataCatalog.TABLE_NAME)
public class DataCatalog extends GCPResource {

    protected static final String TABLE_NAME = "gcpdatacatalog";
    public static final String RESOURCE_TYPE = "GCP::DataCatalog::EntryGroup";

    public DataCatalog() {
        this.resourceType = RESOURCE_TYPE;
    }
}
