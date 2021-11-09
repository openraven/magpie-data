package io.openraven.magpie.data.gcp.monitoring;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = MonitoringService.TABLE_NAME)
public class MonitoringService extends GCPResource {

    protected static final String TABLE_NAME = "gcpmonitoringservice";
    public static final String RESOURCE_TYPE = "GCP::Monitoring::Service";

    public MonitoringService() {
        this.resourceType = RESOURCE_TYPE;
    }
}
