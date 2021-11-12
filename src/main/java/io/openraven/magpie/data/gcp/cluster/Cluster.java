package io.openraven.magpie.data.gcp.cluster;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Cluster.TABLE_NAME)
public class Cluster extends GCPResource {

    protected static final String TABLE_NAME = "gcpcluster";
    public static final String RESOURCE_TYPE = "GCP::ClusterManager::Cluster";

    public Cluster() {
        this.resourceType = RESOURCE_TYPE;
    }
}
