package codewar.com.Keypad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeypadTest {

    @Test
    public void simpleTest_Then_9() {
		assertEquals(9, Keypad.presses("LOL"));
    }

    @Test
    public void simpleTest_Then_13() {
		assertEquals(13, Keypad.presses("HOW R U"));
    }
    
    @Test
    public void Given_WHERE_DO_U_WANT_2_MEET_L8R_Then_47() {
		assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }
    
    @Test
    public void Given_Complicated_sentense_Then_53() {
		assertEquals(53, Keypad.presses("JyTfVOVdtiJa$GR'bgc!SqP,VXU,iK"));
    }
    

}
