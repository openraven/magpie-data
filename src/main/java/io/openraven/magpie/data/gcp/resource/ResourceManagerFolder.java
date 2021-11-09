package io.openraven.magpie.data.gcp.resource;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ResourceManagerFolder.TABLE_NAME)
public class ResourceManagerFolder extends GCPResource {

    protected static final String TABLE_NAME = "gcpresourcemanagerfolder";
    public static final String RESOURCE_TYPE = "GCP::ResourceManager::Folder";

    public ResourceManagerFolder() {
        this.resourceType = RESOURCE_TYPE;
    }
}
