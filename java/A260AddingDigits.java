package CodeForces;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A260AddingDigits 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		String line [] = br.readLine().split(" ");
		long a =Integer.parseInt(line[0]);
		int b =Integer.parseInt(line[1]);
		int c =Integer.parseInt(line[2]);
		StringBuilder out = new StringBuilder(a+"");
		boolean ff= true;
		while(c-->0)
		{	boolean f =false;
			a=(a%b*10%b)%b;
			
			for(int i=0;i<10;i++)
			{
				if(((a%b+i%b)%b)==0)
				{	f=true;
					a=((a%b+i%b)%b);
					out.append("" +i);
					break;
				}
				
			}
			if(!f)
			{
				ff=false ;break;
			}
		}
		if(ff)
		{
			System.out.println(out);
		}
		else
		{
			System.out.println("-1");
		}
		
	}
}
