package io.openraven.magpie.data.gcp.redis;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = RedisInstance.TABLE_NAME)
public class RedisInstance extends GCPResource {

    protected static final String TABLE_NAME = "gcpredisinstance";
    public static final String RESOURCE_TYPE = "GCP::Redis::Instance";

    public RedisInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
