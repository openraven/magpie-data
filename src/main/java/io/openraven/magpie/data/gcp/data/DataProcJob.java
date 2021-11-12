package io.openraven.magpie.data.gcp.data;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DataProcJob.TABLE_NAME)
public class DataProcJob extends GCPResource {

    protected static final String TABLE_NAME = "gpcdataprocjob";
    public static final String RESOURCE_TYPE = "GCP::Dataproc::Job";

    public DataProcJob() {
        this.resourceType = RESOURCE_TYPE;
    }
}
