package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A476DreamoonandStairs
{static final int oo = 1<<28;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line [] = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int x = Integer.parseInt(line[1]);
		int out = n/2;
		out += n%2;
		while(out%x!=0)
			out++;
		if(n<x)
			out =-1;
		System.out.println(out);
	}

//	private static int  search(int l,int n, int x) {
//		if(l>n)
//			return oo;
//		if(l==n)
//			if(l%x==0)
//				return 1;
//			else 
//				return oo;
//		int take1 = 1+search (l+1,n,x);	
//		int take2 = 1+search (l+2,n,x);
//		return Math.min(take1, take2);
//		
//	}
}
