package collection.Set;

import java.util.*;

public class LinkeHasSet {

	public static void main(String[] args) {

		//LinkedHashSet contains the order as it uses linkedList and Hashing internally
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for(int i=0;i<10;i++) {
			s.add(i);
		}
		for(Integer i:s) {
			System.out.println(i);
		}
		
		
	/*	public boolean add(Object o)		Adds an object to a LinkedHashSet if already not present in HashSet.
		public boolean remove(Object o)		Removes an object from LinkedHashSet if found in HashSet.
		public boolean contains(Object o)	Returns true if object found else return false
		public boolean isEmpty()			Returns true if LinkedHashSet is empty else return false
		public int size()					Returns number of elements in the LinkedHashSet*/
			}
		
}
