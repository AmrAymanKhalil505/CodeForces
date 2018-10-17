package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A139PetrandBook 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new  InputStreamReader(System.in) );
		int n =Integer.parseInt(br.readLine());
		int arr []= new int [7];
		String line []  = br.readLine().split(" ");
		for(int i=0;i<line.length;i++)
		{
			arr[i]= Integer.parseInt(line[i]);
			
		}
		int out = -1;
		while(n>0)
		for(int i=0;i<line.length;i++)
		{
			n-=arr[i];
			if(n<=0)
			{
				out = i;
				break;
			}
		}
		System.out.println(out+1 );
	}
}
