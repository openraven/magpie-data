package io.openraven.magpie.data.gcp.dialogflow;

import io.openraven.magpie.data.gcp.GCPResource;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@Table(name = DialogflowConversation.TABLE_NAME)
public class DialogflowConversation extends GCPResource {

    protected static final String TABLE_NAME = "gcpdialogflowconversation";
    public static final String RESOURCE_TYPE = "GCP::Dialogflow::Conversation";

    public DialogflowConversation() {
        this.resourceType = RESOURCE_TYPE;
    }
}
