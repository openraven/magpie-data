package io.openraven.magpie.data.gcp.monitoring;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = MonitoringDashboard.TABLE_NAME)
public class MonitoringDashboard extends GCPResource {

    protected static final String TABLE_NAME = "gcpmonitoringdashboard";
    public static final String RESOURCE_TYPE = "GCP::MonitoringDashboard::Dashboard";

    public MonitoringDashboard() {
        this.resourceType = RESOURCE_TYPE;
    }
}
