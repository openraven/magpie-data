package io.openraven.magpie.data.gcp.data;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DataLabelingAnnotations.TABLE_NAME)
public class DataLabelingAnnotations extends GCPResource {

    protected static final String TABLE_NAME = "gcpdatalabelingannotations";
    public static final String RESOURCE_TYPE = "GCP::DataLabeling::AnnotationSpecSet";

    public DataLabelingAnnotations() {
        this.resourceType = RESOURCE_TYPE;
    }
}
