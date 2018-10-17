package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B600Queriesaboutlessorequalelements
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 
		 String line []= br.readLine().split(" ");
		 int N = Integer.parseInt(line[0]);
		 int M = Integer.parseInt(line[1]);
		 ArrayList<Integer> aNum = new ArrayList<Integer>();
		 ArrayList<Integer> bNum = new ArrayList<Integer>();
		 line = br.readLine().split(" ");
		 for(int i=0;i<line.length;i++)
		 {
			 aNum.add(Integer.parseInt(line[i]));
		 }
		 line =br.readLine().split(" ");Collections.sort(aNum);
		 StringBuilder sb = new StringBuilder("");
		 for(int i=0;i<line.length;i++)
		 {
			int r = BinarySearch(Integer.parseInt(line[i]), aNum)+1 ;
			sb.append(r+" ");
		 }
		 System.out.println(sb.toString());
		 
		 
	}
	static int BinarySearch(int N , ArrayList<Integer> aNum)
	{
		int high = aNum.size()-1;
		int low = 0;
		int r = -1;
		while(high>=low)
		{
			int mid = low + ((high-low)>>2);
			if(aNum.get(mid) >N)
			{
				high = mid-1;
			}
			else
			{
				r = mid ;
				low =mid+1;
			}
		}
		return r;
		
	}
}
