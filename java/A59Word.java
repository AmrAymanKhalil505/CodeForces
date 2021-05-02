package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A59Word {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		String line =br.readLine();
		int u=0;
		int l=0;
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)-'a'<=26&&line.charAt(i)-'a'>=0)
			{
				l++;
			}
			else 
			{
				u++;
			}
		}
	if(u>l)
		{
		System.out.println(line.toUpperCase());
		
		}
	else
	{
		System.out.println(line.toLowerCase());
	}
	}
}
