package IO;

import java.io.*;

public class Byte {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/ByteArray.txt");
		byte b[]= {'a','b','c','d','e'};
		ByteArrayOutputStream bis = new ByteArrayOutputStream();
		bis.write(b);
		bis.writeTo(fos);
		
		
		
		
//		ByteArrayInputStream bos = new ByteArrayInputStream(b);
//		byte[] c = new byte[20];
//		bos.read(c);
//		String s = new String(c);
//		System.out.println(s);
		
		FileInputStream fis = new FileInputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/ByteArray.txt");
		byte x[] = new byte[fis.available()];
		fis.read(x);
		String s = new String(x);
		System.out.println(s);
	
	
	}

}
