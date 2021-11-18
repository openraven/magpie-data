/*-
 * #%L
 * Magpie API
 * %%
 * Copyright (C) 2021 Open Raven Inc
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.openraven.magpie.data.aws.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.openraven.magpie.data.aws.AWSResource;
import io.openraven.magpie.data.aws.accounts.IamGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntityTypeResolverTest {

    public static final ObjectMapper MAPPER = new ObjectMapper().registerModule(new JavaTimeModule());

    @Test
    public void testResolveAwsIamGroup() throws JsonProcessingException {
        String json = "{\n" +
            "  \"documentId\":\"4jUz_CPXMG-Z7f8oJltkPg\",\n" +
            "  \"arn\":\"arn:aws:iam::000000000000:group/Accountants\",\n" +
            "  \"resourceName\":\"Accountants\",\n" +
            "  \"resourceId\":\"y9xomssf3o582439fxep\",\n" +
            "  \"resourceType\":\"AWS::IAM::Group\",\n" +
            "  \"awsRegion\":\"us-west-1\",\n" +
            "  \"awsAccountId\":\"account\",\n" +
            "  \"createdIso\":null,\n" +
            "  \"updatedIso\":\"2021-06-23T09:44:50.397706Z\",\n" +
            "  \"discoverySessionId\":null,\n" +
            "  \"maxSizeInBytes\":null,\n" +
            "  \"sizeInBytes\":null,\n" +
            "  \"configuration\":{\n" +
            "    \"path\":\"/\",\n" +
            "    \"groupName\":\"Accountants\",\n" +
            "    \"groupId\":\"y9xomssf3o582439fxep\",\n" +
            "    \"arn\":\"arn:aws:iam::000000000000:group/Accountants\",\n" +
            "    \"createDate\":null\n" +
            "  },\n" +
            "  \"supplementaryConfiguration\":{\n" +
            "    \"inlinePolicies\":[\n" +
            "      {\n" +
            "        \"name\":\"inlineDataAccess\",\n" +
            "        \"policyDocument\":\"{\\\"Version\\\":\\\"2012-10-17\\\",\\\"Statement\\\":[{\\\"Effect\\\":\\\"Deny\\\",\\\"Action\\\":[\\\"dynamodb:DeleteItem\\\",\\\"dynamodb:GetItem\\\"],\\\"Resource\\\":\\\"*\\\"}]}\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"attachedPolicies\":[\n" +
            "      {\n" +
            "        \"name\":\"managedDataAccess\",\n" +
            "        \"arn\":\"arn:aws:iam::000000000000:policy/managedDataAccess\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  \"tags\":{\n" +
            "\n" +
            "  },\n" +
            "  \"discoveryMeta\":{\n" +
            "\n" +
            "  }\n" +
            "}\n";

        AWSResource awsResource = MAPPER.readValue(json, AWSResource.class);
        Assertions.assertEquals(IamGroup.class, awsResource.getClass());
    }


}
