import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest{
	
	@Test
	public void testThatCalculatorCanAddTwoNumbers(){
			//precondition
			SimpleCalculator myCalculator = new SimpleCalculator();
			//Action
			int sum = myCalculator.add(2, 4);
			//Check/Assert
			assertEquals(6 , myCalculator.add(2, 4));
		

		}

	@Test 
	public void  testThatCalculatorCanSubtractTwoNumbers(){

		SimpleCalculator myCalculator = new SimpleCalculator();

		int subtract = myCalculator.sub(4, 2);

		assertEquals(2 , myCalculator.sub(4, 2));

		}




	@Test
	public void testThatCalculatorCanMultiplyTwoNumbers(){

		SimpleCalculator myCalculator = new SimpleCalculator();

		int product  = myCalculator.times(4, 2);

		assertEquals(8 , myCalculator.times(4, 2));

		}

	@Test
	public void testThatCalculatorCanMultiplyTwoNumbersWithoutMultiplyFunctions(){
	
		SimpleCalculator myCalculator = new SimpleCalculator();

		int product  = myCalculator.times(4, 2);

		
		assertEquals(8 , myCalculator.times(4,2));



		}


	@Test
	public void testThatCalculatorCanAddMoreThanTwoNumbers(){
			
			SimpleCalculator myCalculator = new SimpleCalculator();
			
			int sum = myCalculator.add(2, 4, 5, 6);
	
			assertEquals(17 , myCalculator.add(2, 4, 5, 6));
			}

}