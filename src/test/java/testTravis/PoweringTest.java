package testTravis;

import static org.junit.Assert.*;

import org.junit.Test;

public class PoweringTest {

	
	@Test
	public void poweringTest() {
		int result = (int) FunKwadratowa.powering(2,2);
        int expectedResult = 4;
        assertEquals(result, expectedResult);
	}

}
