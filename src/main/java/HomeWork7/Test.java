package HomeWork7;

import HomeWork7.UnitTest;

public class Test {

    @org.junit.Test
    public void token() {

        UnitTest.addToken();

        UnitTest.makingReservation();

        UnitTest.negativeIdTest();

        UnitTest.negativeDelete();

        UnitTest.updateReservation();

        UnitTest.deleteReservation();
    }
}