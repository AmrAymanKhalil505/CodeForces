package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class A605SortingRailwayCars {
	static int dp [];static int n=0; static ArrayList<Integer> nums = new ArrayList<Integer>();
	static int mn;
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 n = Integer.parseInt(br.readLine());
		 String line[]=br.readLine().split(" ");
		 mn=n;
		dp = new int [n+1];//1 indexed
		
		 for(int i=0;i<n;i++)
		 {
			 nums.add( Integer.parseInt(line[i])); 
			 
		 }
		 int max =0;
		while(!nums.isEmpty())
			 max =Math.max(max, trying(nums.get(0),0));
		System.out.println(n-max);	
		
	}
	private static int trying(Integer integer,int j) {
		if(mn==integer)
		{
			mn--;
			dp[integer]=1;
			
		}
		if (dp[integer]!=0)
		{	nums.remove(j);
		
			return dp[integer];
		}
		
		for(int i=j+1;i<nums.size();i++)
		{
			if(nums.get(i)==integer+1)
			{dp[integer]=1+trying(integer+1, i);
			
			nums.remove(j);
			
			return dp[integer];
			}
		}
		
		dp[integer]=1;
		//System.out.println(integer+" "+j+" "+dp[integer]);
		nums.remove(j);
		return 1;
	}
}

