package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A281WordCapitalization {
 public static void main(String[] args) throws IOException {
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 String l= br.readLine();
	 System.out.println((l.charAt(0)+"").toUpperCase()+l.substring(1));
	
}
}
