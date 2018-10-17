package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A276LunchRush
{
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		String line [] = br.readLine().split(" " );
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		long max =1<<62;
		max *=-1;
		for(int i=0;i<n;i++)
		{
			line = br.readLine().split(" ");
			int f = Integer.parseInt(line[0]);
			int t = Integer.parseInt(line[1]);
			if(t>k)
			 f = f-(t-k);
			max = Math.max(f, max);
		}
		System.out.println(max);
	}
}
