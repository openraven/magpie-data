package io.openraven.magpie.data.gcp.osconfig;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = OsConfigPatchJob.TABLE_NAME)
public class OsConfigPatchJob extends GCPResource {

    protected static final String TABLE_NAME = "gcposconfigpatchjob";
    public static final String RESOURCE_TYPE = "GCP::OsConfig::PatchJob";

    public OsConfigPatchJob() {
        this.resourceType = RESOURCE_TYPE;
    }
}
