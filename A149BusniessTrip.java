package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A149BusniessTrip {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		String line []= br.readLine().split(" ");
		ArrayList<Integer> g= new ArrayList<Integer>();
		for(int i=0;i<line.length;i++)
		{
			g.add(Integer.parseInt(line[i]));
		}
		Collections.sort(g);
		int r=0;int c=0;
		for(int i=0;i<g.size()&&r<k;i++)
		{
			r+=g.get(g.size()-1-i);c++;
			if(r>=k)
			{
				break;
			}
		}
		if(r>=k)
		System.out.println(c);
		else
			System.out.println("-1");
	}
}
