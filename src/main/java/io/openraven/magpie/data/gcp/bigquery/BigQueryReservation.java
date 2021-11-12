package io.openraven.magpie.data.gcp.bigquery;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = BigQueryReservation.TABLE_NAME)
public class BigQueryReservation extends GCPResource {

    protected static final String TABLE_NAME = "bigqueryreservation";
    public static final String RESOURCE_TYPE = "GCP::BigQueryReservation::Reservation";

    public BigQueryReservation() {
        this.resourceType = RESOURCE_TYPE;
    }
}
