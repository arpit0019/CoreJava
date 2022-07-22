package collection.Set;

import java.util.* ;

public class HasSet {

	public static void main(String[] args) {
	/*it does not contain the order */
		Set<Integer> s = new HashSet<>();
		for(int i =0 ; i<30; i++) {
			s.add(i);
		}
		
		for(Integer i: s) {
			System.out.println(i);
		}
	}

}
