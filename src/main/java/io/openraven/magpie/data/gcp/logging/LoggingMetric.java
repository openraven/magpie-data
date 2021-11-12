package io.openraven.magpie.data.gcp.logging;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = LoggingMetric.TABLE_NAME)
public class LoggingMetric extends GCPResource {

    protected static final String TABLE_NAME = "gcploggingmetric";
    public static final String RESOURCE_TYPE = "GCP::Logging::Metric";

    public LoggingMetric() {
        this.resourceType = RESOURCE_TYPE;
    }
}
