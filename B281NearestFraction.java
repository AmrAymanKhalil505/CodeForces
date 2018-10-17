package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B281NearestFraction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());
		// binary search 
		long low = 0;
		long high =	(long)1e9;long output =-1;
		
		while(low<high)
		{long mid =(low/2+high/2)+1;
		String sSt = mid+"";
		int sx =0;
		for(int i=0;i<sSt.length();i++)
		{
			sx+=(sSt.charAt(i)-'0');
		}long mult =mid*mid+sx*mid;
	
			if(mult==num)
			{
				output=mid;
				high =mid-1;
			}
			else if(mult>num)
			{
				
				high= mid-1;
			}
			else
			{
				low =mid+1;
			}
			
		}
		System.out.println(output);
		
	}
}
