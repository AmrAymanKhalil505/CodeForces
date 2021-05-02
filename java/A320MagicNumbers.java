package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A320MagicNumbers
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		 String line = br.readLine();
		 boolean f =true;
		 for(int i=0;i<line.length();i++)
		 {
			 if(line.charAt(i)=='1'){
				 if(i+1<line.length()&&line.charAt(i+1)=='4')
				 {
					 i++;
					 if(i+1<line.length()&&line.charAt(i+1)=='4')
					 {
						 i++;
					 }
				 }
			 }
			 else
				 {
				 	f=false;
				 }
		 }
		 System.out.println(f?"YES":"NO");
	}
}
