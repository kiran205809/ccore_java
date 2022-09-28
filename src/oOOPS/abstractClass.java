package oOOPS;

public abstract class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public void add() {
		int a = 10;
		int b = 5;
		int c= a+b;
		System.out.println("Value of c is "+c);
	}
	public void sub () {
		
		int a = 5;
		int b = 2;
		int c= a-b;
		System.out.println("Value of c is "+c);
	}
     
	abstract void mul();
	abstract void div();
}
 