package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A214SystemOfEquations {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		String line []= br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		//a*a +a +b*b+b=n+m
		int nm= Math.max(n, m);
		int r =0;
		for(int i=0;i<=nm;i++)
		{
			for(int j=0;j<=nm;j++)
			{
				if(n==(i*i+j)&&m==(j*j+i))
					{r++;
					
					}
			}
			
		}
		System.out.println(r);
	}
}
