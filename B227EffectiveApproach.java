package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B227EffectiveApproach 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 int arr []= new int [n+1];
		 String line [] =br.readLine().split(" ");
		 for(int i=0;i<n;i++)
		 {
			 arr[Integer.parseInt(line[i])]=i+1;
		 }
		 long r0 =0;
		 long rl =0;
		 int x = Integer.parseInt(br.readLine());
		 line =br.readLine().split(" ");
		 for(int i=0;i<x;i++)
		 {
			 r0+=arr[Integer.parseInt(line[i])];
			 rl+=n-arr[Integer.parseInt(line[i])]+1;
			
		 }
		 System.out.println(r0+" "+rl);
	}
}
