package io.openraven.magpie.data.gcp.vision;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = ProductSet.TABLE_NAME)
public class ProductSet extends GCPResource {

    protected static final String TABLE_NAME = "gcpvisionproductset";
    public static final String RESOURCE_TYPE = "GCP::Vision::ProductSet";

    public ProductSet() {
        this.resourceType = RESOURCE_TYPE;
    }
}
