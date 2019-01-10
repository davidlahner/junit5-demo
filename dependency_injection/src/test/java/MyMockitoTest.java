import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyMockitoTest {

    @Test
    void simpleTestWithInjectedMock(@Mock Person person) {
        //arrange
        when(person.getFirstName()).thenReturn("Dilbert");

        //act & assert
        assertEquals("Dilbert", person.getFirstName());
    }

}