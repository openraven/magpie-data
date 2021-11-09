package io.openraven.magpie.data.gcp.pubsublite;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = PubSubLiteSubscription.TABLE_NAME)
public class PubSubLiteSubscription extends GCPResource {

    protected static final String TABLE_NAME = "gcppubsublitesubscription";
    public static final String RESOURCE_TYPE = "GCP::PubSubLite::Subscription";

    public PubSubLiteSubscription() {
        this.resourceType = RESOURCE_TYPE;
    }
}
