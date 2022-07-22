package IO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
	
			FileOutputStream fos1 = new FileOutputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test1.txt");
			String str = "Arpit is the Good coder";
			String s= str.toUpperCase();
			fos1.write(s.getBytes());
			fos1.close();
		
			
			FileInputStream fis1 = new FileInputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test1.txt");
			byte[] b=new byte[fis1.available()];
			fis1.read(b);
			String x = new String(b);
			System.out.println(x);
			
			

			FileOutputStream fos2 = new FileOutputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test2.txt");
			
			String y= x.toLowerCase();
			fos2.write(y.getBytes());
			fos2.close();
				
			
			FileInputStream fis2 = new FileInputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test2.txt");
			byte[] c=new byte[fis2.available()];
			fis2.read(c);
			String z =new String(c);
			System.out.println(z);
			
			 
	}

}
