package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A69YoungPhysicist {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int TC= Integer.parseInt(br.readLine());String line [];int x =0;
		int y = 0;int z =0;
		while(TC-->0)
		{
			line =br.readLine().split( " ");
			x +=Integer.parseInt(line [0]);
			y +=Integer.parseInt(line[1]);
			z+=Integer.parseInt(line[2]);
			
		}
		if(x==y&&y==z&&z==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
