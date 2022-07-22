package Networking;

import java.io.*;
import java.net.*;

public class SoServer {

	public static void main(String[] args)throws Exception {
		System.out.println("Server is Started");
		ServerSocket ss = new ServerSocket(9999);
		Socket st = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		String str = br.readLine();
		System.out.println("Client Data : "+str);
		st.close();
	}

}
