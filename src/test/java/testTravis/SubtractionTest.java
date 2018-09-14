package testTravis;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTest {

	@Test
	public void subtractionTest() {
		int result = FunKwadratowa.subtraction(4,2);
        int expectedResult = 3;
        assertEquals(result, expectedResult);
	}

}
