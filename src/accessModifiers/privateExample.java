package accessModifiers;



//Private work's only with in same class.not in other class with in the same package
public class privateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		privateExample pe = new privateExample();
		pe.printprivate();
        
	}
	
	private void printprivate() {
		System.out.println("Print the private message");
	}

}
