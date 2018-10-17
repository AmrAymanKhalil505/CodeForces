package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A104Backjack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		if(n<=10)
		{
			System.out.println("0");
			
		}
		else if(n<20)
		{
			System.out.println("4");
		}
		else if(n==20)
		{
			System.out.println("15");
		}
		else if(n==21)
		{
			System.out.println("4");
		}
		else
		{
			System.out.println("0");
		}
		
	}
}
