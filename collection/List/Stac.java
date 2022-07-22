package collection.List;

import java.util.Stack;

public class Stac {

	public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.push(0);
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	for(Integer n : s) {
		System.out.println(n);
		
	}
	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
	System.out.println(s.peek());
	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
	System.out.println(s.pop());
	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
	System.out.println(s.search(1));
	

	}

}
