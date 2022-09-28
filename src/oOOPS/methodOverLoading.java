package oOOPS;


//Having the multiple functions/methods with the same name with different parameters is called overloading.
public class methodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodOverLoading ml = new methodOverLoading();
		ml.add();
		ml.add(2, 3);
		
		
	}
	
	
	public void add() {
		
		int a = 10;
		int b=  20;
		int c = 10+20;
		System.out.println("Addition of a and b is "+c);
		
	}
	
	public void add(int a, int b) {
		
		int c = a+b;
		System.out.println("addition of a and b is "+c );
		
		
	}

}
