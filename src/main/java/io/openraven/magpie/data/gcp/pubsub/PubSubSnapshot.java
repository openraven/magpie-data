package io.openraven.magpie.data.gcp.pubsub;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = PubSubSnapshot.TABLE_NAME)
public class PubSubSnapshot extends GCPResource {

    protected static final String TABLE_NAME = "gcppubsubsnapshots";
    public static final String RESOURCE_TYPE = "GCP::PubSub::Snapshots";

    public PubSubSnapshot() {
        this.resourceType = RESOURCE_TYPE;
    }
}
