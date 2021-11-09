package io.openraven.magpie.data.gcp.scheduler;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = SchedulerJob.TABLE_NAME)
public class SchedulerJob extends GCPResource {

    protected static final String TABLE_NAME = "gcpschedulerjob";
    public static final String RESOURCE_TYPE = "GCP::Scheduler::Job";

    public SchedulerJob() {
        this.resourceType = RESOURCE_TYPE;
    }
}
