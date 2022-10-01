package oOOPS;

public class kiranCarUpdate extends kiranCar {

	public static void main(String[] args) {
		
		kiranCarUpdate kc = new kiranCarUpdate();
		kc.engine();
		kc.transmission();
		kc.steering();
		kc.breaking();
		kc.airbags();
		

	}

	public void airbags() {
		System.out.println("AirBags is implemented");
		
	}

}
