package oOOPS;

public class parentClass {

	public static void main(String[] args) {
		
	
		parentClass pc = new parentClass();
		
		
		//static functions can be called directly without any object creation.
		add();
		pc.add();
		pc.sub();
		 
         
	}
	static public void add() {
		
		
		//Below declared variables are local variable
		int a =10;
		int b =20;
		int c= a+b;
		System.out.println("Addition of A and B is "+c );
		
	}

public void sub() {
		
		
		//Below declared variables are local variable
		int a =30 ;
		int b =20;
		int c= a-b;
		System.out.println(" Subtraction of A and B is "+c );
		
	}
}
