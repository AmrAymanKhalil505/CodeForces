package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A439DevutheSingerandChurutheJoker 
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br =  new  BufferedReader( new InputStreamReader(System.in));
		 String line [] = br.readLine().split(" ");
		 int n = Integer.parseInt(line[0]);
		 int t = Integer.parseInt(line[1]);
		 line  = br.readLine().split(" ");
		 t-= (n-1)*10;
		 for(int i=0;i<n;i++)
		 {
			 t-= Integer.parseInt(line[i]);
		 }
		 if(t<0)
		 {
			 System.out.println(-1);
		 }
		 else if(t==0)
		 {
			 System.out.println((n-1)*2);
		 }
		 else
		 {int c = 0;
			for(int i =0;t>=5;i++)
			{	
				t-= 5 ;
				c++;
			}
			System.out.println((n-1)*2+c);
		 }
		 
	}
}
