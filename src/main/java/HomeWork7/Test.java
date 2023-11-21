package HomeWork7;

import io.restassured.response.Response;

public class Test {
    private static final String positiveToken = "token";
    private static final String NEGATIVE_BODY = "{\n" +
            "    \"username\" : \"adminn\",\n" +
            "    \"password\" : \"password235\"\n" +
            "}";

    private static String idNegative = "000000";

    private static final String BODY = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    private static final String BODY_RESERVATION = "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
    private static final String BODY_UPDATE = "{\n" +
            "    \"firstname\" : \"James\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-02-01\",\n" +
            "        \"checkout\" : \"2019-02-23\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    private static final String NEGATIVE_BODY_RESERVATION = "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2118-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
    @org.junit.Test

    public void testPositiveToken() {
        System.out.println("Получение токена ");
        Response getToken = UnitTest.responseToken(BODY);
        getToken.then()
                .statusCode(200)
                .log().body();
       String token = getToken.jsonPath().getString(positiveToken);
        System.out.println("Получили токен " + token);
    }

    @org.junit.Test
    public void testMakingReservation() {

        System.out.println("Получение бронирования ");
        Response bookingId = UnitTest.makingReservation(BODY_RESERVATION);
        bookingId.then().statusCode(200).log().body();
        String id = bookingId.jsonPath().getString("bookingid");

        System.out.println("Проверка создания бронирования");
        Response check = UnitTest.bookingСheck(id);
        check.then().statusCode(200).log().body();
        System.out.println("Позитивный тест: создание и проверка бронирования ");
    }

    @org.junit.Test
    public void testUpdateReservation() {
        System.out.println("Получаем токен");
        Response getToken = UnitTest.responseToken(BODY);
        getToken.then()
                .statusCode(200)
                .log().body();
       String token = getToken.jsonPath().getString(positiveToken);

        System.out.println("Получение бронирования ");
        Response bookingId = UnitTest.makingReservation(BODY_RESERVATION);
        bookingId.then().statusCode(200).log().body();
        String id = bookingId.jsonPath().getString("bookingid");

        System.out.println("Изменение бронирования");
        Response update = UnitTest.updateReservation(id, token, BODY_UPDATE);
        update.then().statusCode(200).log().body();

        System.out.println("Проверка создания бронирования");
        Response check = UnitTest.bookingСheck(id);
        check.then().statusCode(200).log().body();
    }

    @org.junit.Test
    public void testDeleteReservation(){
        System.out.println("Получаем токен");
        Response getToken = UnitTest.responseToken(BODY);
        getToken.then().statusCode(200).log().body();
        String token = getToken.jsonPath().getString(positiveToken);

        System.out.println("Получение бронирования ");
        Response bookingId = UnitTest.makingReservation(BODY_RESERVATION);
        bookingId.then().statusCode(200).log().body();
        String id = bookingId.jsonPath().getString("bookingid");

        System.out.println("Удаление бронирования");
        Response deleteResponse = UnitTest.deleteReservation(id, token);
        deleteResponse.then().statusCode(201).log().body();

        System.out.println("Проверка удаленного бронирования");
        Response check = UnitTest.bookingСheck(id);
        check.then().statusCode(404).log().body();
    }

    @org.junit.Test
    public void testNegativeToken(){
        System.out.println("Получение токена(неверные логин/пароль)");
        Response wrongToken = UnitTest.negativeToken(NEGATIVE_BODY);
        wrongToken.then().statusCode(200).log().body();
        String tokenNeg = wrongToken.jsonPath().getString(positiveToken);
    }

    @org.junit.Test
    public void testNegativeMakingReservation(){
        System.out.println("Создание бронирования(неверное тело)");
        Response bookingId = UnitTest.negativeMakingReservation(NEGATIVE_BODY_RESERVATION);
        bookingId.then().statusCode(200).log().body();
        String id = bookingId.jsonPath().getString("bookingid");
    }

    @org.junit.Test
    public void testNegativeBookingСheck() {
        System.out.println("Проверка бронирования с несуществующим id");
        Response negativeCheck = UnitTest.negativeId(idNegative);
        negativeCheck.then().statusCode(404).log().body();
    }

    @org.junit.Test
    public void testNegativeDelete() {
        System.out.println("Получаем токен");
        Response getToken = UnitTest.responseToken(BODY);
        getToken.then().statusCode(200).log().body();
        String token = getToken.jsonPath().getString(positiveToken);

        System.out.println("Удаление бронирования с несуществующим id");
        Response deleteResponse = UnitTest.deleteReservation(idNegative, token);
        deleteResponse.then().statusCode(405).log().body();
    }
}