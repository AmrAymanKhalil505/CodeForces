package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A469IWannaBetheGuy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		int n = Integer.parseInt(br.readLine());
		boolean levels[] = new boolean[n];
		String line []= br.readLine().split(" ");
		for(int i=1;i<line.length;i++)
		{
			levels[Integer.parseInt(line[i])-1]=true;
		}
		 line = br.readLine().split(" ");
		for(int i=1;i<line.length;i++)
		{
			levels[Integer.parseInt(line[i])-1]=true;
		}boolean f =true;
		for(int i=0;i<n;i++)
		{
			if(!levels[i])
			{
				f= false;
				break;
			}
		}
		if(f)
		{
			System.out.println("I become the guy.");
		}
		else
		{
			System.out.println("Oh, my keyboard!" );
		}
	}
}
