/*
 * Copyright 2021 Open Raven Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openraven.magpie.data.aws.interfaces;

import com.fasterxml.jackson.databind.JsonNode;
import io.openraven.magpie.data.aws.utils.JsonConverter;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.time.Instant;

@Access(AccessType.FIELD)
@MappedSuperclass
public class AWSResource {
    @Id
    @Column(name = "documentid", columnDefinition = "TEXT",
            nullable = false, unique = true)
    public String documentId;

    @Column(name = "arn", columnDefinition = "TEXT")
    public String arn;
    @Column(name = "resourcename", columnDefinition = "TEXT")
    public String resourceName;
    @Column(name = "resourceid", columnDefinition = "TEXT")
    public String resourceId;

    // this needs to be updatable = false due to its use a a discriminator
    @Column(name = "resourcetype", columnDefinition = "TEXT", updatable = false)
    public String resourceType;

    @Column(name = "awsregion", columnDefinition = "TEXT")
    public String awsRegion;
    @Column(name = "awsaccountid", columnDefinition = "TEXT")
    public String awsAccountId;
    @Column(name = "creatediso", columnDefinition = "TIMESTAMPTZ")
    public Instant createdIso;
    @Column(name = "updatediso", columnDefinition = "TIMESTAMPTZ")
    public Instant updatedIso;
    @Column(name = "discoverysessionid", columnDefinition = "TEXT")
    public String discoverySessionId;

    @Transient
    public Long maxSizeInBytes;
    @Transient
    public Long sizeInBytes;

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
}
