package io.openraven.magpie.data.gcp.memcache;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = MemcacheInstance.TABLE_NAME)
public class MemcacheInstance extends GCPResource {

    protected static final String TABLE_NAME = "gcpmemcacheinstance";
    public static final String RESOURCE_TYPE = "GCP::Memcache::Instance";

    public MemcacheInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
