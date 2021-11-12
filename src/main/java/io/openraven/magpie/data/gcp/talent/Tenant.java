package io.openraven.magpie.data.gcp.talent;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Tenant.TABLE_NAME)
public class Tenant extends GCPResource {

    protected static final String TABLE_NAME = "gcptalenttenant";
    public static final String RESOURCE_TYPE = "GCP::Talent::Tenant";

    public Tenant() {
        this.resourceType = RESOURCE_TYPE;
    }
}
