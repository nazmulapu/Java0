package insideInside;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Alist {
	public static void main(String[] args) {
		ArrayList<String> frad = new ArrayList<String>();
		
		frad.add("E");
		frad.add("K");
		frad.add("A");
		frad.add("S");
		
		System.out.println(frad);
		ListIterator<String> indi = frad.listIterator();
		while (indi.hasNext()){
			String value = indi.next();
			System.out.println(value);
		}
		
		
		
		for (String g : frad) {
			System.out.println(g + " is nice");
			
		}
		
		frad.add("Sa");
		
		for (int i = 0; i < frad.size(); i++) {
			System.out.println(frad.get(i));
			
		}
		
		HashMap<String, String> loc = new HashMap<String, String>();
		loc.put("Mirpur", "two nights");
		loc.put("Adabor", "8 times");
		loc.put("shekertek", "25 times");
		System.out.println(loc);
		Set<String> keys = loc.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("wonderful ocasions happaned in " + value + " for " + loc.get(value));
			
		}
		
		
		
	}

}
