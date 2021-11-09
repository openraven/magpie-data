package io.openraven.magpie.data.gcp.security;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = WebSecurity.TABLE_NAME)
public class WebSecurity extends GCPResource {

    protected static final String TABLE_NAME = "gcpsecurityscanconfig";
    public static final String RESOURCE_TYPE = "GCP::WebSecurityScanner::ScanConfig";

    public WebSecurity() {
        this.resourceType = RESOURCE_TYPE;
    }
}
