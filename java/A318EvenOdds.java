package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A318EvenOdds {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line []=br.readLine().split(" ");
		double n = Double.parseDouble(line[0]);
		double k = Double.parseDouble(line[1]);
		String r ="";
		
	/*	if(n%2 ==0)
			{
			if(k<=(n/2))
			{
				int x=1;
				for(int i=0;i<k-1;i++)
				{
					x+=2;
				}
				r=x+"";
			}
			else
			{
				k-=n/2;
				int x=0;
					for(int i=0;i<k-1;i++)
					{
						x+=2;
					}
					r=x+"";
				
			}
			}
		else
			{
			if(k<=(n/2+1))
			{
				int x=1;
				for(int i=0;i<k-1;i++)
				{
					x+=2;
				}
				r=x+"";
			}
			else
				{
				k-=n/2;
				int x=0;
					for(int i=0;i<k-1;i++)
					{
						x+=2;
					}
					r=x+"";
				
				}
			}*/
			if(k<=Math.ceil(n/2))
			{
				
			
			long x =(long) (((k)*2)-1);
				r=x+"";
				
			}
			else
			{	long x =1;k=k-Math.ceil(n/2);
			
			x=(long) ((k)*2);	
				r=x+"";
			}
		System.out.println(r);
	}
}