package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A224Parallelepiped 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new  InputStreamReader(System.in));
		String line [] = br.readLine().split(" ");
		double AB = Integer.parseInt(line[0]);
		double BC = Integer.parseInt(line[1]);
		double AC = Integer.parseInt(line[2]);
		
		double B=Math.round(Math.sqrt(AB*BC/AC));
		double A = Math.round(AB/B);
		double C=Math.round( BC/B);
		
		
		
		System.out.println((int)(A*4+B*4+C*4));
	}
}
