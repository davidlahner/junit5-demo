import org.junit.jupiter.api.Test;


class ExceptionAssertion {

    @Test
    void testException() {

    }


    private static void doSomething() {
        throw new IllegalArgumentException("Test");
    }
}
