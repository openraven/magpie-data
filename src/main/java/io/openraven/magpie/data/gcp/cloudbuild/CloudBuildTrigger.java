package io.openraven.magpie.data.gcp.cloudbuild;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = CloudBuildTrigger.TABLE_NAME)
public class CloudBuildTrigger extends GCPResource {

    protected static final String TABLE_NAME = "gcpcloudbuildtrigger";
    public static final String RESOURCE_TYPE = "GCP::CloudBuild::BuildTrigger";

    public CloudBuildTrigger() {
        this.resourceType = RESOURCE_TYPE;
    }
}
