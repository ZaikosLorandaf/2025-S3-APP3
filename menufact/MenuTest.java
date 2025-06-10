package menufact;

import menufact.exceptions.MenuException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void testSingleton(){
        Menu m = Menu.getSingleton("");
        assertEquals(m,Menu.getSingleton(""));
    }

    @Test
    void testPositionSuivanteFail(){
        try {
            Menu.getSingleton("").positionSuivante();
            fail();
        } catch (MenuException e) {
            assertTrue(true);
        }
    }

    @Test
    void testPositionPrecedentFail(){
        try {
            Menu.getSingleton("").positionSuivante();
            fail();
        } catch (MenuException e) {
            assertTrue(true);
        }
    }

}