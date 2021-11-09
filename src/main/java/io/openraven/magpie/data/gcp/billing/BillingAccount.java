package io.openraven.magpie.data.gcp.billing;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = BillingAccount.TABLE_NAME)
public class BillingAccount extends GCPResource {

    protected static final String TABLE_NAME = "gcpbillingaccount";
    public static final String RESOURCE_TYPE = "GCP::Billing::BillingAccount";

    public BillingAccount() {
        this.resourceType = RESOURCE_TYPE;
    }
}
