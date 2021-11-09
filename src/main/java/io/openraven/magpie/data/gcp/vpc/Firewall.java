package io.openraven.magpie.data.gcp.vpc;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Firewall.TABLE_NAME)
public class Firewall extends GCPResource {

    protected static final String TABLE_NAME = "gcpvpcfirewall";
    public static final String RESOURCE_TYPE = "GCP::VPC::Firewall";

    public Firewall() {
        this.resourceType = RESOURCE_TYPE;
    }
}
