package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A268Games {
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		int arrHost [] = new int [TC];
		int arrGuest [] = new int [TC];
		for(int i=0;i<TC;i++)
		{
			String line [] = br.readLine().split(" ");
			arrHost[i]= Integer.parseInt(line [0]);
			arrGuest[i]= Integer.parseInt(line[1]);
		}
		int out = 0;
		for(int i =0;i<TC;i++)
		{
			for(int j =i+1;j<TC;j++)
			{
				if(arrGuest[i]==arrHost[j])
					out++;
				if(arrGuest[j]==arrHost[i])
					out++;
			}
		}
		System.out.println(out);
	}
}
