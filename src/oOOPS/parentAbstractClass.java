package oOOPS;

public class parentAbstractClass extends abstractClass{
int a=10;
int b=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		parentAbstractClass pa = new parentAbstractClass();
		pa.add();
		pa.sub();
		pa.mul();
		pa.div();
		
	}
	
	public void mul() {
		
		int c = a*b;
		System.out.println("Value of c is "+c);
	
	}
	public void div() {
		
		int c= a/b;
		System.out.println("Value of c is "+c);
		
	}

}
