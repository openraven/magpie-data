package io.openraven.magpie.data.gcp.bigquery;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = BigQueryDataTransfer.TABLE_NAME)
public class BigQueryDataTransfer extends GCPResource {

    protected static final String TABLE_NAME = "gcpbigquerydatatransfer";
    public static final String RESOURCE_TYPE = "GCP::BigQueryDataTransfer::TransferConfig";

    public BigQueryDataTransfer() {
        this.resourceType = RESOURCE_TYPE;
    }
}
