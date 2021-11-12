package io.openraven.magpie.data.gcp.account;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = IamRole.TABLE_NAME)
public class IamRole extends GCPResource {

    protected static final String TABLE_NAME = "gcpiamrole";
    public static final String RESOURCE_TYPE = "GCP::Iam::Role";

    public IamRole() {
        this.resourceType = RESOURCE_TYPE;
    }
}
