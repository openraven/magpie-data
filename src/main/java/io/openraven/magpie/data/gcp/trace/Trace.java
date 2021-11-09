package io.openraven.magpie.data.gcp.trace;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Trace.TABLE_NAME)
public class Trace extends GCPResource {

    protected static final String TABLE_NAME = "gcptrace";
    public static final String RESOURCE_TYPE = "GCP::Trace::Trace";

    public Trace() {
        this.resourceType = RESOURCE_TYPE;
    }
}
