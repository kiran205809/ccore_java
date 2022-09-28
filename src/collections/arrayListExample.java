package collections;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		// TO add data
		al.add("Kiran");//0 index
		al.add("Karan");//1 index
		al.add("Kishore");// 2 index
		al.add("Krishna"); //3 index
		al.add("Kishan"); //4 index
		
		//To fetch the data
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		
		// To fetch the data using loop
		
		// To fetch the size 
	     
	int size	=al.size();
		System.out.println(size);
		
		
		
		for(int a=0; a<5; a++) {
			 
			System.out.println(al.get(a));
		}


	}
	
	
	

}
