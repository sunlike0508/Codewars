package codewar.com.SimpleSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleSumTest {

    @Test
    public void basicTests(){     
        assertEquals(0,SimpleSum.solve(0));
        assertEquals(1,SimpleSum.solve(1));
        assertEquals(18,SimpleSum.solve(18));
        assertEquals(11,SimpleSum.solve(29));
        assertEquals(33,SimpleSum.solve(1140));
        assertEquals(68,SimpleSum.solve(50000000));
        assertEquals(117,SimpleSum.solve(2348045091L));
    }

}
