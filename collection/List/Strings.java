package collection.List;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		String s = "I am Arpit Mudgal";
		ArrayList<String> as = new ArrayList<>();
		String temp="";

		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==(' ')||i==s.length()-1) {
				
				as.add(temp);
				temp ="";
				continue;
			}
			temp = temp+s.charAt(i);
		}
		System.out.println(as);
		for(int i=as.size()-1;i>=0;i--) {
			System.out.print(as.get(i)+" ");
		}
	}

}
