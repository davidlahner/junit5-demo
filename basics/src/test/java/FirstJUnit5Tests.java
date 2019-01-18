import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstJUnit5Tests {

    @Test
    void myFirstTest() {
        Person testee = new Person("Hans", "Meier");
        assertEquals("Hans", testee.getFirstName(), "First name");
    }
}
