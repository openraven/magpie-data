package io.openraven.magpie.data.gcp.dlp;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DlpJobTrigger.TABLE_NAME)
public class DlpJobTrigger extends GCPResource {

    protected static final String TABLE_NAME = "gcpdlpjobtrigger";
    public static final String RESOURCE_TYPE = "GCP::Dlp::JobTrigger";

    public DlpJobTrigger() {
        this.resourceType = RESOURCE_TYPE;
    }
}
