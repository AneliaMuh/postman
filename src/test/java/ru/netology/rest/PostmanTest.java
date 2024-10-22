package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanTest {
    @Test
    void ShouldReturnSendData() {
        String text = "Hello";
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Buy"))
        ;
    }
}
