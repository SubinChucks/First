package main.com.kist.first;

public class FirstProject {
	
	public static void main(String[] args){
		
		Calculation c = new Calculation();
		int Addition = c.add(10,20);
		System.out.println("The Addition is :"+Addition);
		
		int Subtraction = c.sub(20,10);
		System.out.println("The Subtraction is:"+Subtraction);
		
		int Multiplication=c.mul(5, 8);
		System.out.println("The Multiplication is:"+Multiplication);
		
		int Division=c.div(20,10);
		System.out.println("The Division is :"+Division);
		
	}

}
