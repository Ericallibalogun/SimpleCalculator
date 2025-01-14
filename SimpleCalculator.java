public class SimpleCalculator{

	public int add(int firstNumber, int secondNumber){
	int sum = firstNumber + secondNumber;


		return sum;
		
  
	}
	public int sub(int firstNumber, int secondNumber){
	int sub = firstNumber - secondNumber;
	
	return sub;
	}

	public int times(int firstNumber, int secondNumber) {
	int product =  firstNumber * secondNumber;

	return product;
	}
	
	public int multiply(int firstNumber, int secondNumber){
	int result = 0;

	for(int number = 0;number < secondNumber;number++){

	result += secondNumber;
	}	
	return result;
	
	}

	public int add(int firstNumber, int secondNumber, int thirdNumber,int fourthNumber){
	int  sum= firstNumber + secondNumber + thirdNumber + fourthNumber;
	
	return sum;
	}


}