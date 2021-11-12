package io.openraven.magpie.data.gcp.bigquery;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = BigQueryReservationCapacity.TABLE_NAME)
public class BigQueryReservationCapacity extends GCPResource {

    protected static final String TABLE_NAME = "bigqueryreservationcapacity";
    public static final String RESOURCE_TYPE = "GCP::BigQueryReservation::CapacityCommitment";

    public BigQueryReservationCapacity() {
        this.resourceType = RESOURCE_TYPE;
    }
}
