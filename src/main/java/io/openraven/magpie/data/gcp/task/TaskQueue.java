package io.openraven.magpie.data.gcp.task;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = TaskQueue.TABLE_NAME)
public class TaskQueue extends GCPResource {

    protected static final String TABLE_NAME = "gcptaskqueue";
    public static final String RESOURCE_TYPE = "GCP::Tasks::Queue";

    public TaskQueue() {
        this.resourceType = RESOURCE_TYPE;
    }
}
