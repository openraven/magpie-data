package io.openraven.magpie.data.gcp.data;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DataProcCluster.TABLE_NAME)
public class DataProcCluster extends GCPResource {

    protected static final String TABLE_NAME = "gpcdataproccluster";
    public static final String RESOURCE_TYPE = "GCP::Dataproc::Cluster";

    public DataProcCluster() {
        this.resourceType = RESOURCE_TYPE;
    }
}
