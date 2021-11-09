package io.openraven.magpie.data.gcp.vpc;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Network.TABLE_NAME)
public class Network extends GCPResource {

    protected static final String TABLE_NAME = "gcpvpcnetwork";
    public static final String RESOURCE_TYPE = "GCP::VPC::Network";

    public Network() {
        this.resourceType = RESOURCE_TYPE;
    }
}
