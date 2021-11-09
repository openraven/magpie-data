package io.openraven.magpie.data.gcp.service;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Service.TABLE_NAME)
public class Service extends GCPResource {

    protected static final String TABLE_NAME = "gcpservicediscoveryservice";
    public static final String RESOURCE_TYPE = "GCP::ServiceDirectory::Service";

    public Service() {
        this.resourceType = RESOURCE_TYPE;
    }
}
