package io.openraven.magpie.data.gcp.sql;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = SqlInstance.TABLE_NAME)
public class SqlInstance extends GCPResource {

    protected static final String TABLE_NAME = "gcpsqlinstance";
    public static final String RESOURCE_TYPE = "GCP::SQL::Instance";

    public SqlInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
