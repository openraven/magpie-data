package io.openraven.magpie.data.gcp.game;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = GameService.TABLE_NAME)
public class GameService extends GCPResource {

    protected static final String TABLE_NAME = "gcpgameservice";
    public static final String RESOURCE_TYPE = "GCP::GameServices::Realm";

    public GameService() {
        this.resourceType = RESOURCE_TYPE;
    }
}
