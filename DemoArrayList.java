package session8.assignment1;

import java.util.ArrayList;
import java.util.Iterator;


public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//ArrayList<Srtring> al = new ArrayList<>();
		 
		al.add("Johny");
		al.add(5);
		al.add(new Integer(9));
		
		System.out.println(al);
		
		
		
		System.out.println("output using iterator");
		System.out.println("===========================");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		
	}

}
