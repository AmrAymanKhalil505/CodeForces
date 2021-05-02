package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A486CalculatingFunction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		long n= Long.parseLong(br.readLine());
		if(n%2==0)
		{
			System.out.println(n/2);
			
		}
		else
		{
			System.out.println(-1*(n/2+1));
		}
	}
}
