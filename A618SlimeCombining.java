package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class A618SlimeCombining {
	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));StringBuilder out= new StringBuilder();
	 int n=Integer.parseInt(br.readLine()); int j=0;int k=1;ArrayList<Integer> nums= new ArrayList<Integer>();nums.add(1);
	
	 for(int i=1;i<n;i++)
	 {
		 while(k==nums.get(j))
		 {nums.remove(j);
		 	j=j-1;
		 	k++;
		 	if(j<0)
		 	{
		 		break;
		 	}
			 
		 }
		 nums.add(k);
		 k=1;j=nums.size()-1;
		 
	 }
	 for(int i=0;i<nums.size();i++)
	 {
		 out.append(nums.get(i)+" ");
	 }
	 System.out.println(out.toString().trim());
	}

}
