package Networking;

import java.io.*;
import java.net.*;

public class ReverseEcho {

	public static void main(String[] args) throws Exception {
		ServerSocket ss= new ServerSocket(2000);
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		String s;
		StringBuilder sb;
		do {
		s = br.readLine();
		sb = new StringBuilder(s);
		sb.reverse();
		s=sb.toString();

		ps.println(s);}while(!s.equals("dne"));
		stk.close();
		
	}

}
