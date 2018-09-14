package testTravis;

import static org.junit.Assert.*;

import org.junit.Test;



public class MultiplicationTest {

	@Test
	public void multiplicationTest() {
		
		 int result = FunKwadratowa.multiple(2,4);
	        int expectedResult = 8;
	        assertEquals(result, expectedResult);

}
}
