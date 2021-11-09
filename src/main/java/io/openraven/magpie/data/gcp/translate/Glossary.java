package io.openraven.magpie.data.gcp.translate;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = Glossary.TABLE_NAME)
public class Glossary extends GCPResource {

    protected static final String TABLE_NAME = "gcptranslateglossary";
    public static final String RESOURCE_TYPE = "GCP::Translate::Glossary";

    public Glossary() {
        this.resourceType = RESOURCE_TYPE;
    }
}
