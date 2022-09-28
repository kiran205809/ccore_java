package collections;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new  HashMap<String,Integer>();
		hm.put("Appu", 1);
		hm.put("Abhi", 2);
		hm.put("Akash", 5);
		
		System.out.println(hm.size());
		
		for(Map.Entry str:hm.entrySet()) {
			
			System.out.println(str.getKey()+""+str.getValue());
		}
	}

}
