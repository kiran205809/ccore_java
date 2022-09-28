package collections;

import java.util.Hashtable;

public class hashTableExample {

	
	
	//<key,value>pair
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(100, "Kiran");
		table.put(200, "Manoj");
		table.put(300, "Raju");
		table.put(400, "Bhanu");
		table.put(500, "Chetan");
		
		System.out.println(table.size());
		System.out.println(table.get(500));
		System.out.println(table.get(100));
		
		
		

	}

}
