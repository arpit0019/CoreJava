package collection.List;

import java.util.*;

public class LisIterator {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("India");
		l.add("Sri Lnanka");
		l.add("Nepal");
		l.add("Bangladesh");
		l.add("Pakistan");
		LisIterator li = new LisIterator();
		li.displayList(l);
		l.sort(null);
		li.displayList(l);
		Collections.reverse(l);
		li.displayList(l);
	}

	void displayList(List<String> s) {
		ListIterator it = s.listIterator();
		while(it.hasNext()) {
			System.out.println("Element : "+ it.next());
		}
		System.out.println("XXXXXXXXXXXXXX");
	}
}
