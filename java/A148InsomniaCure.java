package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A148InsomniaCure {
	static boolean dList [] = new boolean [(int) (1e5+5)];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int k =Integer.parseInt(br.readLine());
		int l= Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
		int r=0;
		for(int i=1;i<=d;i++)
		{
			if((i%k)==0&&!dList[i])
			{
				dList[i]=true;r++;
			}
			if((i%m)==0&&!dList[i])
			{
				dList[i]=true;r++;
			}
			if((i%l)==0&&!dList[i])
			{
				dList[i]=true;r++;
			}
			if((i%n)==0&&!dList[i])
			{
				dList[i]=true;r++;
			}
		}
		System.out.println(r);
	}
 
 
}
