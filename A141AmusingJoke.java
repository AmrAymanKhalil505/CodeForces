package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A141AmusingJoke {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader( System.in));
		int Alp []= new int [26];
		String line1=br.readLine();
		String line2=br.readLine();
		String line3=br.readLine();
		if((line1.length()+line2.length())!=line3.length())
			System.out.println("NO");
		else
		{
			for(int i=0;i<line3.length();i++)
			{
				Alp[line3.charAt(i)-'A']++;
			}
			for(int i=0;i<line1.length();i++)
			{
				Alp[line1.charAt(i)-'A']--;
			}
			for(int i=0;i<line2.length();i++)
			{
				Alp[line2.charAt(i)-'A']--;
			}
			boolean f =false;
			for(int i=0;i<26;i++)
			{if(Alp[i]!=0)
				f=true;
		
			}
			if(f)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		
		}
		
	}
}
