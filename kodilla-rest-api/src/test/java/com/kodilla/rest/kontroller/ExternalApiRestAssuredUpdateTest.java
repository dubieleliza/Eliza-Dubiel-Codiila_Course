package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredUpdateTest {

    @Test
    void shouldUpdatePost() {
        String updatedBody = """
                {
                    "id": 1,
                    "title": "Updated title",
                    "body": "Updated body",
                    "userId": 1
                }
                """;

        given()
                .header("Content-type", "application/json")
                .body(updatedBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated title"))
                .body("body", equalTo("Updated body"))
                .body("userId", equalTo(1))
                .log().all();
    }
}