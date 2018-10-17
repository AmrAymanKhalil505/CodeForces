package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A230Dragons {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line [] = br.readLine().split(" ");
		long s = Long.parseLong(line[0]);
		int n = Integer.parseInt(line[1]);
		ArrayList<pair> arr = new ArrayList<pair>();
		for(int i=0;i<n;i++)
		{line = br.readLine().split(" ");
			arr.add(new pair(Integer.parseInt(line[0]),Integer.parseInt(line[1])));
			
		}
		boolean flage = true;
		Collections.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(s<=arr.get(i).s)
			{
				flage = false ;
				break;
			}
			else
			{
				s+= arr.get(i).b;
			}
		}
		if(flage)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	static class pair implements Comparable<pair> 
	
	{
		int s ; int b ;
		public pair (int s , int p)
		{
			this.s = s;
			this.b = p;
		}
		@Override
		public int compareTo(pair o) {
			return this.s - o.s;
		}
		
	}
}
