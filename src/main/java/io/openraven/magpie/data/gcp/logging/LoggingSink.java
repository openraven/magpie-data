package io.openraven.magpie.data.gcp.logging;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = LoggingSink.TABLE_NAME)
public class LoggingSink extends GCPResource {

    protected static final String TABLE_NAME = "gcploggingsink";
    public static final String RESOURCE_TYPE = "GCP::Logging::Sink";

    public LoggingSink() {
        this.resourceType = RESOURCE_TYPE;
    }
}
