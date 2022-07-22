package collection.Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapss {

	public static void main(String[] args) {
		Map<Integer,String> students= new HashMap<>();
		
		students.put(1,"Arpit");
		students.put(3,"Manisha");
		students.put(4,"Kanhaiya");
		students.put(9,"Sumit");
		students.put(8,"Hanuman");
		students.put(6,"Anmol");
		students.put(5,"Kritik");
		students.put(7,"Chaitanya");
		students.put(2,"Himanshu");
		
		Iterator entry = students.entrySet().iterator();

//		while(entry.hasNext()) {
//			System.out.println(entry.next());
//		}
		
		while(entry.hasNext()) {
			Map.Entry mapElement = (Map.Entry)entry.next();
			System.out.println("Roll Number = "+mapElement.getKey() +" Name = "+mapElement.getValue());
		}
	}

}
