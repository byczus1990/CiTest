package testTravis;

import static org.junit.Assert.*;

import org.junit.Test;


public class DivisionTest {

	@Test
	public void divisionTest() {
		int result = FunKwadratowa.division(4,2);
        int expectedResult = 2;
        assertEquals(result, expectedResult);
	}

}
