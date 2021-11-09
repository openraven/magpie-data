package io.openraven.magpie.data.gcp.dns;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DnsZone.TABLE_NAME)
public class DnsZone extends GCPResource {

    protected static final String TABLE_NAME = "gcpdnszone";
    public static final String RESOURCE_TYPE = "GCP::Dns::Zone";

    public DnsZone() {
        this.resourceType = RESOURCE_TYPE;
    }
}
