package calismalar;

import java.util.ArrayList;

public class substringComparisons {

	public static void main(String[] args) {
		
		System.out.println(getSmallestAndLargest("welcometojava", 3));
		

	}
	
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "a";
        ArrayList<String> heceler = new ArrayList<String>();
        
        for (int counter = 0; counter < s.length() -(k-1); counter++) {
			heceler.add(s.substring(counter, counter + k));
			if (heceler.get(counter).compareTo(smallest) < 0) {
				smallest = heceler.get(counter);
			}
			if (heceler.get(counter).compareTo(largest) > 0) {
				largest = heceler.get(counter);
			}
		}
        if (s.length() == k) {
			smallest = s;
			largest = s;
		}
        
        
        return smallest + "\n" + largest;
    }

}
