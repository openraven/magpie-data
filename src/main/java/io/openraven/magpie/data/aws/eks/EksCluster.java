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
package io.openraven.magpie.data.aws.eks;

import io.openraven.magpie.data.aws.interfaces.AWSResource;
import io.openraven.magpie.data.aws.shared.PayloadUtils;
import software.amazon.awssdk.services.eks.model.Cluster;

@javax.persistence.Entity
@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
@javax.persistence.Table(name = EksCluster.TABLE_NAME)
public class EksCluster extends AWSResource {

  protected static final String TABLE_NAME = "awsekscluster";
  public static final String RESOURCE_TYPE = "AWS::EKS::Cluster";

  public EksCluster() {
    this.resourceType = RESOURCE_TYPE;

  }


  public EksCluster(String account, String regionId, Cluster cluster) {
    this.awsRegion = regionId;
    this.awsAccountId = account;
    this.arn = cluster.arn();
    this.resourceName = cluster.name();
    this.configuration = PayloadUtils.update(cluster);
    this.resourceType = RESOURCE_TYPE;
  }
}
