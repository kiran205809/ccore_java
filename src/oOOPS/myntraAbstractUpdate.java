package oOOPS;

public class myntraAbstractUpdate extends myntraAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myntraAbstractUpdate mu = new myntraAbstractUpdate();
		mu.signup();
		mu.login();
		mu.loginwithmobileNumber();
		mu.homepage();
		mu.logout();
		

	}

	@Override
	public void loginwithmobileNumber() {
		
		System.out.println("Enter a mobile to login ");
		
	}
	public void logout() {
		
		System.out.println("Click a button to logout");
	}
	

}
