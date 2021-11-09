package io.openraven.magpie.data.gcp.iot;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = IotDeviceRegistry.TABLE_NAME)
public class IotDeviceRegistry extends GCPResource {

    protected static final String TABLE_NAME = "gcpiotdeviceregistry";
    public static final String RESOURCE_TYPE = "GCP::IoT::deviceRegistry";

    public IotDeviceRegistry() {
        this.resourceType = RESOURCE_TYPE;
    }
}
