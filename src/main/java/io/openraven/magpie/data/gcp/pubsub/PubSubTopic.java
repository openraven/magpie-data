package io.openraven.magpie.data.gcp.pubsub;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = PubSubTopic.TABLE_NAME)
public class PubSubTopic extends GCPResource {

    protected static final String TABLE_NAME = "gcppubsubtopic";
    public static final String RESOURCE_TYPE = "GCP::PubSub::Topic";

    public PubSubTopic() {
        this.resourceType = RESOURCE_TYPE;
    }
}
