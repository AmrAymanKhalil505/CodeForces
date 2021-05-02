package CodeForces;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A236BoyorGirl {
	static int alp []= new int [26];
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		String l =br.readLine();
		l=l.toLowerCase();
		for(int i=0;i<l.length();i++)
		{
			int x =l.charAt(i)-'a';
			alp[x]++;
			
		}int d =0;
		for(int i=0;i<26;i++)
		{
			if(alp[i]!=0)
			{
				d++;
			}
		}
		if(d%2==0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
		{
			System.out.println("IGNORE HIM!");
		}
	}
}
