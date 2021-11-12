package io.openraven.magpie.data.gcp.osconfig;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = OsConfigPatchDeployment.TABLE_NAME)
public class OsConfigPatchDeployment extends GCPResource {

    protected static final String TABLE_NAME = "gcposconfigpatchdeployment";
    public static final String RESOURCE_TYPE = "GCP::OsConfig::PatchDeployment";

    public OsConfigPatchDeployment() {
        this.resourceType = RESOURCE_TYPE;
    }
}
