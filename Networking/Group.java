package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Group extends Thread {
	Scanner sc1 = new Scanner(System.in);
	Socket stk;
	
	Group(Socket stk){
		this.stk=stk;
	}
	
	public void run() {
		 try {
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
		
		sc1.close();
		 stk.close();
		 }
		 
		 catch(Exception e) {};
	}
	
	
	public static void main(String[] args)throws Exception {
		ServerSocket s1= new ServerSocket(2589);
		System.out.println("Server Started");
		Socket stk ;
		Group g;
	    int count=0;
		do {
		stk= s1.accept();	
		System.out.println("Client number "+ count++);
		g=new Group(stk);
		g.start();
		}while(true);
	   
		

	}

}
