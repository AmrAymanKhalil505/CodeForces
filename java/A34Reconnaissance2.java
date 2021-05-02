package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class A34Reconnaissance2 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line [] = br.readLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<line.length;i++)
		{
			arr.add(Integer.parseInt(line[i]));
		}
		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		for(int i=0;i<line.length-1;i++)
		{		pq.add(new pair(Math.abs(arr.get(i)-arr.get(i+1)),i+1,i+2));
			
			
			
		}pq.add(new pair(Math.abs((arr.get(0)-arr.get(line.length-1))),1,line.length));
		pair x1 = pq.remove();
		
		System.out.println(x1.i+" "+x1.ii);
	}
	static class pair implements Comparable<pair> 
	{
		int x;
		int ii;
		int i;
		public pair (int x , int i,int ii)
		{
			this.x =x;
			this.i =i;
			this.ii = ii;
		}
		@Override
		public int compareTo(pair o) {
			
			return this.x-o.x;
		} 
	}
	

}
