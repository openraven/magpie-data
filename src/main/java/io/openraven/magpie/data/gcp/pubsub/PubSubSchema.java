package io.openraven.magpie.data.gcp.pubsub;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = PubSubSchema.TABLE_NAME)
public class PubSubSchema extends GCPResource {

    protected static final String TABLE_NAME = "gcppubsubschema";
    public static final String RESOURCE_TYPE = "GCP::PubSub::Schema";

    public PubSubSchema() {
        this.resourceType = RESOURCE_TYPE;
    }
}
