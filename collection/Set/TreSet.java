package collection.Set;

import java.util.*;

public class TreSet {

	public static  void main(String[] args) {
		//it sorts the elements in natural ordering
		
		Set<String> s = new TreeSet<>();
		for(int i=0 ; i<30 ; i++) {
			s.add("A"+i);
		}
		for(String e:s) {
			System.out.println(e);
		}

	}

}
