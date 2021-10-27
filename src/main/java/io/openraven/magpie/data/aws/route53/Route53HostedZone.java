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
package io.openraven.magpie.data.aws.route53;

import io.openraven.magpie.data.aws.interfaces.AWSResource;
import io.openraven.magpie.data.aws.shared.PayloadUtils;
import software.amazon.awssdk.services.route53.model.HostedZone;

@javax.persistence.Entity
@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@javax.persistence.Table(name = Route53HostedZone.TABLE_NAME)
public class Route53HostedZone extends AWSResource {

  protected static final String TABLE_NAME = "awsroute53hostedzone";
  public static final String RESOURCE_TYPE = "AWS::Route53::HostedZone";

  public Route53HostedZone() {
    this.resourceType = RESOURCE_TYPE;
  }

  public Route53HostedZone(String account, String regionId, HostedZone hostedZone) {
    this.awsRegion = regionId;
    this.awsAccountId = account;
    this.resourceId = hostedZone.id();
    this.arn = String.format("arn:aws:route53:::hostedZone/%s", hostedZone.id());
    this.resourceName = hostedZone.name();
    this.configuration = PayloadUtils.update(hostedZone);
    this.resourceType = RESOURCE_TYPE;
  }

}
