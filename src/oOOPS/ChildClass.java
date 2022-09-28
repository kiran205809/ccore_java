package oOOPS;

public class ChildClass extends parentClass {
	
	//Global variables 
	int a = 10;
	int b=5;

	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.add();
		cc.sub();
		cc.mul();
		cc.div();
		

	}
	public void mul() {
		
		int c = a*b;
		System.out.println("Multiple of  a and b is "+c);
		
	}
    public void div() {
		
		int c = a/b;
		System.out.println("Multiple of  a and b is "+c);
}
}
