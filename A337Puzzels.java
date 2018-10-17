package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A337Puzzels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line []=br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m =Integer.parseInt(line [1]);
		line = br.readLine().split(" " );
		ArrayList<Integer> x=new ArrayList<Integer>();
		for(int i=0;i<m;i++)
			x.add(Integer.parseInt(line[i]));
		Collections.sort(x);int min=(int) 1e8;
		for(int i=0;i<(m-n)+1;i++)
		{
			min = Math.min(min, x.get(i+n-1)-x.get(i));
		}
		System.out.println(min);
	}
}
