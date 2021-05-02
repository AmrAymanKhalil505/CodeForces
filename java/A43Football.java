package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A43Football {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader( System.in));
		int n = Integer.parseInt(br.readLine());
		char l1 ;
		char l2 ;
		boolean f1=false;
		boolean f2=false;
		String ss1 ="";
		String ss2 ="";
		int x1=1;
		int x2=0;
		ss1=br.readLine();
		n--;
	String 	line; 
		while(n-->0)
		{	line =br.readLine();
			if(ss1.equals(line))
				
			{
				x1++;
			}
			else
			{if(!f2)
				{
				 	ss2=line;
				 	f2=true;
				}
				x2++;
			}
			
			
		}
		if(x1>x2)
		{
			System.out.println(ss1);
		}
		else
		{
			System.out.println(ss2);
		}
		
	}
}
