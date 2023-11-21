package HomeWork7;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class UnitTest {
    private static final String BASE_URI = "https://restful-booker.herokuapp.com";
    static String token;

    public static Response responseToken(String BODY) {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY)
                .contentType(ContentType.JSON)
                .post(BASE_URI + "/auth");
    }

    public static Response makingReservation(String BODY_RESERVATION) {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY_RESERVATION)
                .contentType(ContentType.JSON)
                .post(BASE_URI + "/booking");
    }

    public static Response bookingСheck(String Id){
        return RestAssured.given()
                .baseUri(BASE_URI)
                .get(BASE_URI + "/booking/" + Id);
    }

    public static Response updateReservation(String id, String token, String BODY_UPDATE) {
        return RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(BASE_URI)
                .body(BODY_UPDATE)
                .contentType(ContentType.JSON)
                .put(BASE_URI + "/booking/" + id);
    }

    public static Response deleteReservation(String id, String token) {
        return RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(BASE_URI)
                .delete(BASE_URI + "/booking/" + id);
    }

    public static Response negativeToken(String NEGATIVE_BODY) {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(NEGATIVE_BODY)
                .contentType(ContentType.JSON)
                .post(BASE_URI + "/auth");
    }

    public static Response negativeId(String idNegative) {
        return RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(BASE_URI)
                .get(BASE_URI + "/booking/" + idNegative);
    }

    public static Response negativeMakingReservation(String NEGATIVE_BODY_RESERVATION){
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(NEGATIVE_BODY_RESERVATION)
                .contentType(ContentType.JSON)
                .post(BASE_URI + "/booking");
    }

    public static Response negativeBookingСheck(String idNegative){
        return RestAssured.given()
                .baseUri(BASE_URI)
                .get(BASE_URI + "/booking/" + idNegative);
    }

    public static Response negativeDelete(String token, String idNegative) {
        return RestAssured.given()
                .header("Cookie", "token=" + token)
                .baseUri(BASE_URI)
                .delete(BASE_URI + "/booking/" + idNegative);
    }
}