package accessModifiers;

public class defaultExample {
	
	
	
	// defaultmodifier works within the same package

	public static void main(String[] args) {
		defaultExample de = new defaultExample();
		de.defaultprint();

	}
	
	void defaultprint() {
		System.out.println("Default Access modifier");
	}

}
