package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A266StonesontheTable {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String line =br.readLine();
		
		char temp=line.charAt(0);
		int c =0;
		for(int i=1;i<line.length();i++)
		{
			if(line.charAt(i)==temp)
			{
				c++;
			}
			temp=line.charAt(i);
		}
		System.out.println(c);
	}
}
