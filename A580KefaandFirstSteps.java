package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A580KefaandFirstSteps {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		String line []= br.readLine().split(" ");
		//ArrayList<Integer> x =new ArrayList<Integer>();
		int x=-1;int last =-1;int max=0; int c=0;
		for(int i=0;i<line.length;i++)
		{
			x=Integer.parseInt(line[i]);
			if(x>=last)
			{
				c++;
				
			}
			else
			{
				c=1;
			}
			last =x;
			if(max<c)
			{
				max= c;
			}
			
			
		}
		System.out.println(max);
		
	}
}
