package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A122LuckyDivision 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean f = search (0,N);
		if(f)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

	private static boolean search(int i, int N ) {
		if(i>N)
			return false ;
		int x1 = i*10+4;
		int x2 = i*10+7;
		if(N%x1==0||N%x2==0)
			return true ;
		else 
			return  search(x1,N)||search (x2,N);
	}
}
