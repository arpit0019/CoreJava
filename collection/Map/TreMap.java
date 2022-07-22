package collection.Map;
import java.util.*;
import java.util.Map.Entry;

class Code implements Comparable<Code>{
	private String lectureno;
	private String sessionno;
	
	
	public Code(String lectureno, String sessionno) {
		this.lectureno = lectureno;
		this.sessionno = sessionno;
	}


	public String getLectureno() {
		return lectureno;
	}


	public String getSessionno() {
		return sessionno;
	}


	@Override
	public int compareTo(Code o) {
		String code1 = sessionno+lectureno;
		String code2= o.getSessionno()+o.getLectureno();
		return code1.compareTo(code2);
		
	}


	@Override
	public String toString() {
		return "Code [lectureno=" + lectureno + ", sessionno=" + sessionno + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(lectureno, sessionno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureno, other.lectureno) && Objects.equals(sessionno, other.sessionno);
	}
	
	
}

public class TreMap {


	public static void main(String[] args) {

		Map<Code,String> lectures = new TreeMap<>();
		lectures.put(new Code("s01", "l01"), "Hindi");
		lectures.put(new Code("s01", "l02"), "SST");
		lectures.put(new Code("s02", "l01"), "English");
		lectures.put(new Code("s01", "l03"), "Math");
		lectures.put(new Code("s02", "l02"), "Science");
		

		for(Entry<Code, String> entry : lectures.entrySet()) {
			System.out.println("lecture number = "+ entry.getKey() +", Subject = "+entry.getValue());
			
		}
		
	}

}
