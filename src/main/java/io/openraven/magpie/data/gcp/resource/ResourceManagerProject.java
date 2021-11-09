package io.openraven.magpie.data.gcp.resource;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ResourceManagerProject.TABLE_NAME)
public class ResourceManagerProject extends GCPResource {

    protected static final String TABLE_NAME = "gcpresourcemanagerproject";
    public static final String RESOURCE_TYPE = "GCP::ResourceManager::Project";

    public ResourceManagerProject() {
        this.resourceType = RESOURCE_TYPE;
    }
}
