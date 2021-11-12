package io.openraven.magpie.data.gcp.recaptcha;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = RecaptchaEnterpriseKey.TABLE_NAME)
public class RecaptchaEnterpriseKey extends GCPResource {

    protected static final String TABLE_NAME = "gcprecaptchaenterprisekey";
    public static final String RESOURCE_TYPE = "GCP::RecaptchaEnterprise::Key";

    public RecaptchaEnterpriseKey() {
        this.resourceType = RESOURCE_TYPE;
    }
}
