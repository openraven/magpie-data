package io.openraven.magpie.data.gcp;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import io.openraven.magpie.data.utils.EntityTypeResolver;
import io.openraven.magpie.data.utils.JsonConverter;

import javax.persistence.*;
import java.time.Instant;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeIdResolver(EntityTypeResolver.class)
@Access(AccessType.FIELD)
@MappedSuperclass
public class GCPResource {
    @Id
    @Column(name = "documentid", columnDefinition = "TEXT",
            nullable = false, unique = true)
    public String documentId;
    @Column(name = "assetid", columnDefinition = "TEXT")
    public String assetId;
    @Column(name = "resourcename", columnDefinition = "TEXT")
    public String resourceName;
    @Column(name = "resourceid", columnDefinition = "TEXT")
    public String resourceId;
    @Column(name = "resourcetype", columnDefinition = "TEXT", updatable = false)
    public String resourceType;
    @Column(name = "projectid", columnDefinition = "TEXT")
    public String projectId;
    @Column(name = "gcpaccountid", columnDefinition = "TEXT")
    public String gcpAccountId;
    @Column(name = "creatediso", columnDefinition = "TIMESTAMPTZ")
    public Instant createdIso;
    @Column(name = "updatediso", columnDefinition = "TIMESTAMPTZ")
    public Instant updatedIso = Instant.now();
    @Column(name = "discoverysessionid", columnDefinition = "TEXT")
    public String discoverySessionId;

    @Transient
    public Long maxSizeInBytes = null;
    @Transient
    public Long sizeInBytes = null;

    @Column(name = "configuration", columnDefinition = "JSONB")
    @Convert(converter = JsonConverter.class)
    public JsonNode configuration;

    @Column(name = "supplementaryconfiguration", columnDefinition = "JSONB")
    @Convert(converter = JsonConverter.class)
    public JsonNode supplementaryConfiguration;

    @Column(name = "tags", columnDefinition = "JSONB")
    @Convert(converter = JsonConverter.class)
    public JsonNode tags;

    @Column(name = "discoverymeta", columnDefinition = "JSONB")
    @Convert(converter = JsonConverter.class)
    public JsonNode discoveryMeta;

    public GCPResource() {
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getGcpAccountId() {
        return gcpAccountId;
    }

    public void setGcpAccountId(String gcpAccountId) {
        this.gcpAccountId = gcpAccountId;
    }

    public Instant getCreatedIso() {
        return createdIso;
    }

    public void setCreatedIso(Instant createdIso) {
        this.createdIso = createdIso;
    }

    public Instant getUpdatedIso() {
        return updatedIso;
    }

    public void setUpdatedIso(Instant updatedIso) {
        this.updatedIso = updatedIso;
    }

    public String getDiscoverySessionId() {
        return discoverySessionId;
    }

    public void setDiscoverySessionId(String discoverySessionId) {
        this.discoverySessionId = discoverySessionId;
    }

    public Long getMaxSizeInBytes() {
        return maxSizeInBytes;
    }

    public void setMaxSizeInBytes(Long maxSizeInBytes) {
        this.maxSizeInBytes = maxSizeInBytes;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public JsonNode getConfiguration() {
        return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
        this.configuration = configuration;
    }

    public JsonNode getSupplementaryConfiguration() {
        return supplementaryConfiguration;
    }

    public void setSupplementaryConfiguration(JsonNode supplementaryConfiguration) {
        this.supplementaryConfiguration = supplementaryConfiguration;
    }

    public JsonNode getTags() {
        return tags;
    }

    public void setTags(JsonNode tags) {
        this.tags = tags;
    }

    public JsonNode getDiscoveryMeta() {
        return discoveryMeta;
    }

    public void setDiscoveryMeta(JsonNode discoveryMeta) {
        this.discoveryMeta = discoveryMeta;
    }
}
