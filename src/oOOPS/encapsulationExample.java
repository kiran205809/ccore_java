package oOOPS;

public class encapsulationExample {
	
	public String name;

	public static void main(String[] args) {
		
		encapsulationExample eE = new encapsulationExample();
		eE.setName("Kiran");
		
		System.out.println(eE.getName());
	
		
		

	}
    
	public String getName() {
		return name;
		
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
}
