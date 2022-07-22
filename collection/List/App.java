package collection.List;

import java.util.*;

class Com implements Comparable<Com> {
	private String com;

	public Com(String com) {
		super();
		this.com = com;
	}

	@Override
	public String toString() {
		return "Com [com=" + com + "]";
	}

	@Override
	public int compareTo(Com o) {
		if (com.length() == o.com.length()) // TODO Auto-generated method stub
		{
			return 0;
		} 
		else if (com.length() < o.com.length()) {
				return -1;
			} 
		else {
			return 1;
		}
	}

}

public class App {

	public static void main(String[] args) {

		List com = new LinkedList<>();
		com.add(new Com("Arpit"));
		com.add(new Com("Manisha"));
		com.add(new Com("Kanhaiya"));
		com.add(new Com("Hanuman"));
		com.add(new Com("Sumit"));
		
		App ap = new App();
		ap.displayList(com);
		
		
		Collections.sort(com);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
		ap.displayList(com);
	}
	void displayList(List<Com> s) {
		ListIterator it = s.listIterator();
		while(it.hasNext()) {
			System.out.println("Element : "+ it.next());
		}
		System.out.println("XXXXXXXXXXXXXX");
	}
}
