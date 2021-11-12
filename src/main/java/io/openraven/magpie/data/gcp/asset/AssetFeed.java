package io.openraven.magpie.data.gcp.asset;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = AssetFeed.TABLE_NAME)
public class AssetFeed extends GCPResource {

    protected static final String TABLE_NAME = "gcpassetfeed";
    public static final String RESOURCE_TYPE = "GCP::Asset::Feed";

    public AssetFeed() {
        this.resourceType = RESOURCE_TYPE;
    }
}
