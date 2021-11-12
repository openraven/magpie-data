package io.openraven.magpie.data.gcp.kms;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = KmsKeyring.TABLE_NAME)
public class KmsKeyring extends GCPResource {

    protected static final String TABLE_NAME = "gcpkmskeyring";
    public static final String RESOURCE_TYPE = "GCP::KMS::Keyring";

    public KmsKeyring() {
        this.resourceType = RESOURCE_TYPE;
    }
}
