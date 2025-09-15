package org.example;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

public class CreateTableExample {
    public static void main(String[] args) {
        DynamoDbClient client = DynamoDBUtil.createClient();

        CreateTableRequest request = CreateTableRequest.builder()
                .tableName("Users")
                .keySchema(
                        KeySchemaElement.builder().attributeName("UserId").keyType(KeyType.HASH).build()
                )
                .attributeDefinitions(
                        AttributeDefinition.builder().attributeName("UserId").attributeType(ScalarAttributeType.S).build()
                )
                .provisionedThroughput(
                        ProvisionedThroughput.builder()
                                .readCapacityUnits(5L)
                                .writeCapacityUnits(5L)
                                .build()
                )
                .build();
        client.createTable(request);
        System.out.println("table 'Users' created!");
    }
}
