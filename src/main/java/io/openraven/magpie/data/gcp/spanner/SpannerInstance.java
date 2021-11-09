package io.openraven.magpie.data.gcp.spanner;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = SpannerInstance.TABLE_NAME)
public class SpannerInstance extends GCPResource {

    protected static final String TABLE_NAME = "gcpspannerinstance";
    public static final String RESOURCE_TYPE = "GCP::Spanner::Instance";

    public SpannerInstance() {
        this.resourceType = RESOURCE_TYPE;
    }
}
