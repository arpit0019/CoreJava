package IO;

import java.io.*;

class Employee implements Serializable{
	int id;
	String name;
	String department;
	Employee(){}
	Employee(String name,int id,String department){
		
		this.name=name;
		this.id = id;
		this.department=department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
}




public class Serializeb {

	public static void main(String[] args)throws Exception {
		 FileOutputStream fos = new FileOutputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Employee.txt");
		 ObjectOutputStream os = new ObjectOutputStream(fos);
		 Employee e1 = new Employee("Arpit",1,"Fresher Developer");
		 os.writeObject(e1);
		 
		 FileInputStream fis = new FileInputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Employee.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 Employee s1 = (Employee)ois.readObject();
		 System.out.println(s1);
		 fis.close();
		 os.close();
		 
	}

}
