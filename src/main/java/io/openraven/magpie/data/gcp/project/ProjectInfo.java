package io.openraven.magpie.data.gcp.project;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ProjectInfo.TABLE_NAME)
public class ProjectInfo extends GCPResource {

    protected static final String TABLE_NAME = "gcpprojectinfo";
    public static final String RESOURCE_TYPE = "GCP::Project::Info";

    public ProjectInfo() {
        this.resourceType = RESOURCE_TYPE;
    }
}
