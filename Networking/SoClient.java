package Networking;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SoClient {

	public static void main(String[] args) throws Exception {
		
		Socket ss = new Socket("localhost",9999);
		System.out.println("Client is connected");
		String s = "Arpit is a good boy";
		OutputStreamWriter os = new OutputStreamWriter(ss.getOutputStream());
		PrintWriter pw = new PrintWriter(os);
		pw.write(s);
		pw.flush();
		ss.close();
		
	}

}
