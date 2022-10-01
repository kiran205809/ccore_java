package oOOPS;

public class constructorExample {

	
	
	// Constructor will have same name as class name
	public static void main(String[] args) {
		
		constructorExample ce = new constructorExample();
		ce.add();
		constructorExample ce1 = new constructorExample();
		
		constructorExample ce2 = new constructorExample("kiran");
		   
	}
	
	public void add() {
		
		int a =10;
		int b =20;
		int c=a+b;
		System.out.println("Value of c is "+c);
	}
	
	// For constructor we dont specify void/any return type
	
	//below functions are examples for methodoverloading
	public constructorExample() {
		
		int a =20;
		int b =40;
		int c=a-b;
		System.out.println("Value of c is "+c); 
		
	}

    public constructorExample(String name) {
		
		System.out.println("Print the name "+name); 
}
}
