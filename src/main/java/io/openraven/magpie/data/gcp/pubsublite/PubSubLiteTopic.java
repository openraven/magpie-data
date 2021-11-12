package io.openraven.magpie.data.gcp.pubsublite;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = PubSubLiteTopic.TABLE_NAME)
public class PubSubLiteTopic extends GCPResource {

    protected static final String TABLE_NAME = "gcppubsublitetopic";
    public static final String RESOURCE_TYPE = "GCP::PubSubLite::Topic";

    public PubSubLiteTopic() {
        this.resourceType = RESOURCE_TYPE;
    }
}
