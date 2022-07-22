package collection.List;

import java.util.LinkedList;

public class LinkList {

	static LinkedList<String> ll = new LinkedList<>();
	public static void main(String[] args) {
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		ll.add("7");
		ll.add("8");
		LinkList al = new LinkList();
		al.displayList(ll);
		ll.add(1, "14");
		al.displayList(ll);
		ll.set(3, "45");
		al.displayList(ll);
	}

	void displayList(LinkedList<String> l) {
		for(String s:l) {
			System.out.println("Element :"+s);
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
