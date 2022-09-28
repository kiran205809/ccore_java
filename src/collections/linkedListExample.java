package collections;

import java.util.LinkedList;

public class linkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<String>();
		
        ls.add("India");
        ls.add("Srilank");
        ls.add("Austrialia");
        ls.add("China");
        ls.add("Singapore");
        
        int size =ls.size();
        System.out.println("Size of the list "+size);
        
        for(int a=0; a<5;a++) {
        	System.out.println(ls.get(a));
        	
        }
	}
	

}
