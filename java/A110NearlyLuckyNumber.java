package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A110NearlyLuckyNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();long  l=line.length();
	
		boolean f =true;
		int c=0;
		
		for(int i=0;i<l;i++)
		{	if(line.charAt(i)=='4')
				{
				c++;
				}
			else if(line.charAt(i)=='7')
				{
				c++;
				}
			
		}
		line=c+""; l=line.length();
		for(int i=0;i<l;i++)
		{	if(line.charAt(i)!='4'&&line.charAt(i)!='7')
			f=false;
				
		}
		if(f)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
