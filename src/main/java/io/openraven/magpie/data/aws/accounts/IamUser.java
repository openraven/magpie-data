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
package io.openraven.magpie.data.aws.accounts;

import io.openraven.magpie.data.aws.AWSResource;
import io.openraven.magpie.data.aws.shared.PayloadUtils;
import software.amazon.awssdk.services.iam.model.User;

@javax.persistence.Entity
@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@javax.persistence.Table(name = IamUser.TABLE_NAME)
public class IamUser extends AWSResource {
  protected static final String TABLE_NAME = "awsiamuser";
  public static final String RESOURCE_TYPE = "AWS::IAM::User";

  public IamUser() {
    this.resourceType = RESOURCE_TYPE;

  }

  public IamUser(String accountId, String region, User user) {
    this.arn = user.arn();
    this.awsAccountId = accountId;
    this.awsRegion = region;
    this.resourceId = user.userId();
    this.resourceName = user.userName();
    this.resourceType = RESOURCE_TYPE;
    this.createdIso = user.createDate();
    this.configuration = PayloadUtils.update(user);
  }
}
