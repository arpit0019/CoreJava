package IO;

import java.io.*;

public class Buffer {

	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte b[] = new byte[bis.available()];
		bis.read(b);
		for(byte x: b) {
			System.out.print((char)x);
		}
	
		
		
		FileReader fi = new FileReader("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test1.txt");
		BufferedReader bi = new BufferedReader(fi);
		byte c[] = new byte[bis.available()];
		bis.read(c);
		for(byte x: c) {
			System.out.print(x);
		}
	}

}
