package io.openraven.magpie.data.gcp.error;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ErrorReporting.TABLE_NAME)
public class ErrorReporting extends GCPResource {

    protected static final String TABLE_NAME = "gcperrorreporting";
    public static final String RESOURCE_TYPE = "GCP::ErrorReporting::GroupStat";

    public ErrorReporting() {
        this.resourceType = RESOURCE_TYPE;
    }
}
