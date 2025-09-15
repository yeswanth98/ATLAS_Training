package org.example;

import java.util.HashMap;
import java.util.Map;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

public class InsertUser {
    public static void main(String[] args) {
        DynamoDbClient client = DynamoDBUtil.createClient();

        Map<String, AttributeValue> item = new HashMap<>();
        item.put("UserID", AttributeValue.builder().s("U1001").build());
        item.put("Name", AttributeValue.builder().s("Yeswanth").build());
        item.put("Age", AttributeValue.builder().n("25").build());

        PutItemRequest request = PutItemRequest.builder()
                .tableName("Users")
                .item(item)
                .build();

        client.putItem(request);
        System.out.println("User inserted successfully!");

    }
}
