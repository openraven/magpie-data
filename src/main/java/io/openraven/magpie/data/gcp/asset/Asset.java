package io.openraven.magpie.data.gcp.asset;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Asset.TABLE_NAME)
public class Asset extends GCPResource {

    protected static final String TABLE_NAME = "gcpasset";
    public static final String RESOURCE_TYPE = "GCP::Asset::Asset";

    public Asset() {
        this.resourceType = RESOURCE_TYPE;
    }
}
