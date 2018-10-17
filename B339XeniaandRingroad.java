package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B339XeniaandRingroad 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line [] = br.readLine().split(" ");
		int n = Integer.parseInt(line [0]);
		int m = Integer.parseInt(line [1]);
		int current = 1;
		long out =0;
		//int arr []= new int [m];
		line = br.readLine().split(" ");
		for(int i=0;i<m;i++)
		{
			int x =  Integer.parseInt(line[i]);
			int y = x- current ;
			if(y<0)
			{
				out += n-current+x;
			}
			else 
			{
				out+= y;
			}
			current=x;
		}
		System.out.println(out);
	}
}
