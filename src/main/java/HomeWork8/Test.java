package HomeWork8;

public class Test {
    private final String BASE_URI = "https://the-internet.herokuapp.com/";
    int number = 5;

    @org.junit.Test
    public void checkboxTest() {
        Checkbox.checkbox(BASE_URI);
    }

    @org.junit.Test
    public void formPositiveAuthenticationTest() {
        FormAuthentication.positiveFormAuthentication(BASE_URI);

    }

    @org.junit.Test
    public void formNegativeAuthenticationTest() {
        FormAuthentication.negativeFormAuthentication(BASE_URI);
    }

    @org.junit.Test
    public void hoversTest() {
        Hovers.hovers(BASE_URI);
    }

    @org.junit.Test
    public void loadedTest() {
        DynamicallyLoadedPageElements.loaded(BASE_URI);
    }

    @org.junit.Test
    public void keyPressesTest() {
        KeyPresses.keyPresses(BASE_URI);
    }

    @org.junit.Test
    public void AddRemoveElementsTest() {
        AddRemoveElements.elements(BASE_URI, number);
    }
}