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
package io.openraven.magpie.data.aws.batch;

import io.openraven.magpie.data.aws.interfaces.AWSResource;
import io.openraven.magpie.data.aws.shared.PayloadUtils;
import software.amazon.awssdk.services.batch.model.JobDefinition;

@javax.persistence.Entity
@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@javax.persistence.Table(name = BatchJobDefinition.TABLE_NAME)
public class BatchJobDefinition extends AWSResource {

  protected static final String TABLE_NAME = "awsbatchjobdefinition";
  public static final String RESOURCE_TYPE = "AWS::Batch::JobDefinition";

  public BatchJobDefinition() {
    this.resourceType = RESOURCE_TYPE;

  }

  public BatchJobDefinition(String account, String regionId, JobDefinition jobDefinition) {
    this.awsRegion = regionId;
    this.awsAccountId = account;
    this.arn = jobDefinition.jobDefinitionArn();
    this.resourceName = jobDefinition.jobDefinitionName();
    this.configuration = PayloadUtils.update(jobDefinition);
    this.resourceType = RESOURCE_TYPE;
  }
}
