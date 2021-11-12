package io.openraven.magpie.data.gcp.account;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = IamServiceAccount.TABLE_NAME)
public class IamServiceAccount extends GCPResource {

    protected static final String TABLE_NAME = "gcpiamserviceaccount";
    public static final String RESOURCE_TYPE = "GCP::Iam::ServiceAccount";

    public IamServiceAccount() {
        this.resourceType = RESOURCE_TYPE;
    }
}
