package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class B34Sale {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String line []=br.readLine().split(" ");
		int m = Integer.parseInt(line[0]);
		int n = Integer.parseInt(line[1]);
		line =br.readLine().split(" ");
		ArrayList<Integer> Nums = new ArrayList();
		for(int i=0;i<m;i++)
		{
			Nums.add(Integer.parseInt(line[i]));	
		}
		String r ="";
		int re=0;
		Collections.sort(Nums);
		for(int i=0;i<n;i++)
		{
			if(Nums.get(i)<0)
			{
				re+=-Nums.get(i);
			}
			
		}
		System.out.println(re);
		
	}
}
