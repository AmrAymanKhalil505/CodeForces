package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A237FreeCash {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String Last="0 0";
		int r=0;
		int max =1;String line;
		for(int i=0;i<T;i++)
		{
			line= br.readLine();
			if(line.equals(Last))
			{
				r++;
			}
			else
			{
				Last =line;
				if(max<r)
				{
					max=r;
				}
				r=1;
			}
		}
		if(r>max)
		{
			max=r;
		}
		System.out.println(max);
	}
}
