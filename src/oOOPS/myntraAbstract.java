package oOOPS;

public abstract class myntraAbstract {
	
	// We cannot create object for abstract class.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void signup() {
		
		System.out.println("Enter the details for signup");
		
	}
	
    public void login() {
		
		System.out.println("Enter a user name and password to login ");
		
	}
    
    public abstract void loginwithmobileNumber();
    
    public void homepage() {
    	
      System.out.println("Welcome to Myntra");
    }

	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
}
