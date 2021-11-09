package io.openraven.magpie.data.gcp.secret;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Secret.TABLE_NAME)
public class Secret extends GCPResource {

    protected static final String TABLE_NAME = "gcpsecretmanagersecret";
    public static final String RESOURCE_TYPE = "GCP::SecretManager::Secret`";

    public Secret() {
        this.resourceType = RESOURCE_TYPE;
    }
}
