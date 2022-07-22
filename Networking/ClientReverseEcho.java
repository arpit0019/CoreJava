package Networking;
import java.io.*;
import java.net.*;
public class ClientReverseEcho {

	public static void main(String[] args) throws Exception {
		Socket st = new Socket("localhost",2000);
		BufferedReader keybr = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		PrintStream ps = new PrintStream(st.getOutputStream());
		String s;
		do {
		s = keybr.readLine();
		ps.println(s);
		s=br.readLine();
		System.out.println("From Client "+s);
		}while(!s.equals("dne"));
		
	}

}
