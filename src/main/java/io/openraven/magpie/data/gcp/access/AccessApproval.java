package io.openraven.magpie.data.gcp.access;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = AccessApproval.TABLE_NAME)
public class AccessApproval extends GCPResource {

    protected static final String TABLE_NAME = "gcpaccess";
    public static final String RESOURCE_TYPE = "GCP::AccessApproval::ApprovalRequest";

    public AccessApproval() {
        this.resourceType = RESOURCE_TYPE;
    }


}
