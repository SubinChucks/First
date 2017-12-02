package main.com.kist.first;

public class Calculation {
	
	int firstNumber;
	int secondNumber;
	
	
	public int add(int firstNumber,int secondNumber)
	{
		int result= firstNumber + secondNumber;
		return result;
	}
	
	public int sub(int firstNumber,int secondNumber){
		int result=firstNumber - secondNumber;
		return result;
		
	}
	
	public int mul(int firstNumber, int secondNumber){
		int result= firstNumber*secondNumber;
		return result;
		
	}
	
	public int div(int firstNumber, int secondNumber){
		int result=firstNumber/secondNumber;
		return result;
	}
	

}
