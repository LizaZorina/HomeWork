package HomeWork7;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class UnitTest {
    static String baseUri = "https://restful-booker.herokuapp.com";
    static String token;
    static String tokentoken;
    static String bookingId;

    public static void addToken() {

        Response negativeToken = given()
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password234\"\n" + //неправильный пароль
                        "}")
                .contentType(ContentType.JSON)
                .post(baseUri + "/auth")
                .then()
                .log()
                .body()
                .extract()
                .response();
        tokentoken = negativeToken.jsonPath().getString("token");
        System.out.println("Негативный тест: получение токена: " + tokentoken);
        System.out.println("");

        Response responseToken = given()
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post(baseUri + "/auth")
                .then()
                .log()
                .body()
                .extract()
                .response();
        token = responseToken.jsonPath().getString("token");
        System.out.println("Позитивный тест: получение токена: " + token);
        System.out.println("");
    }

    public static void makingReservation() {
        Response responseId = given()
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post(baseUri + "/booking")
                .then()
                .log()
                .body()
                .extract()
                .response();
        bookingId = responseId.jsonPath().getString("bookingid");
        System.out.println("Позитивный тест: создание и проверка бронирования ");
        System.out.println("");

        RestAssured.given()
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2118-01-01\",\n" + //изменение даты
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\": \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post(baseUri + "/booking")
                .then()
                .log()
                .body()
                .extract()
                .response();
        System.out.println("Негативный тест: создание и проверка бронирования, добавление некорректной даты");
        System.out.println("");
    }

    public static void updateReservation() {
        RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"firstname\" : \"James\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-02-01\",\n" +
                        "        \"checkout\" : \"2019-02-23\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .put(baseUri + "/booking/" + bookingId)
                .then()
                .log()
                .body()
                .extract()
                .response();
        System.out.println("Позитивное тестирование: полная замена бронирования ");
        System.out.println("");

        RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(baseUri)
                .body("{\n" +
                        "    \"totalprice\" : 999\n" +
                        "}")
                .contentType(ContentType.JSON)
                .patch(baseUri + "/booking/" + bookingId)
                .then()
                .log()
                .body()
                .extract()
                .response();
        System.out.println("Позитивное тестирование: частичная замена параметра бронирования ");
        System.out.println("");
    }

    public static void deleteReservation() {
        RestAssured.given()
                .baseUri(baseUri)
                .delete(baseUri + "/booking/" + bookingId);
        System.out.println("Позитивный тест: удаление бронирования");
        System.out.println("");
    }

    public static void negativeIdTest() {
        RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(baseUri)
                .get(baseUri + "/booking/" + "00000000")
                .then()
                .log()
                .body()
                .extract()
                .response();
        System.out.println("Негативный тест: проверка бронирования с несуществующим id");
        System.out.println("");
    }

    public static void negativeDelete() {
        RestAssured.given()
                .baseUri(baseUri)
                .delete(baseUri + "/booking/" + "00000000");
        System.out.println("Негативный тест: удаление бронирования с неверным id");
    }
}