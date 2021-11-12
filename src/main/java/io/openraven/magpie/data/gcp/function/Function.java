package io.openraven.magpie.data.gcp.function;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Function.TABLE_NAME)
public class Function extends GCPResource {

    protected static final String TABLE_NAME = "gpcfunction";
    public static final String RESOURCE_TYPE = "GCP::Functions::Function";

    public Function() {
        this.resourceType = RESOURCE_TYPE;
    }
}
