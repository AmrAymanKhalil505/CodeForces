package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A116Tram {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		int n = Integer.parseInt(br.readLine());
		int r=0;String line [];int mr=0;
		while(n-->0)
		{
		line =br.readLine().split(" ");	
		r-=Integer.parseInt(line[0]);
		r+=Integer.parseInt(line[1]);
		if(r>mr)
		{
			mr=r;
		}
		}
		System.out.println(mr);
	}
}
