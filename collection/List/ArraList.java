package collection.List;

import java.util.ArrayList;

public class ArraList {

	static ArrayList<String> developers = new ArrayList<>();
	public static void main(String[] args) {
		developers.add("Arpit");
		developers.add("Manisha");
		developers.add("Hanuman");
		developers.add("Kanhaiya");
		developers.add("Sumit");
//System.out.println(developers);
ArraList al = new ArraList();
//al.displayList(developers);
//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//al.removeByPositionIndex(0);
//al.displayList(developers);
//al.removeByName("Manisha");
//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//al.displayList(developers);
al.modifyName(3, "Arpit");
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
al.displayList(developers);

System.out.println(al.search("Sumit"));
//al.displayList(developers);



	}
	int search(String s) {
	return	developers.indexOf(s);
	}
	
	void displayList(ArrayList<String> name) {
		for(String names:name) {
			System.out.println(names);
			
		}
	}	
		void removeByPositionIndex(int n) {
			developers.remove(n);
		}
		void removeByName(String n) {
			developers.remove(n);
		}

		void modifyName(int n , String s) {
			developers.set(n, s);
		}
}
