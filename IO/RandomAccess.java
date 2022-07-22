package IO;

import java.io.*;

public class RandomAccess {

	public static void main(String[] args)throws Exception {
		RandomAccessFile ref = new RandomAccessFile("D:\\Arpit\\Demo-Java\\Collections\\Practice\\src\\IO/Test1.txt","rw");
		System.out.println((char)ref.read());
		System.out.println((char)ref.read());
		System.out.println((char)ref.read());
		System.out.println((char)ref.read());
		ref.write('b');
		System.out.println((char)ref.read());
		System.out.println((char)ref.read());
	}

}
