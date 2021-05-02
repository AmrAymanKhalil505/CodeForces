package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Queue;

public class A82DoubleCola {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		int n =Integer.parseInt(br.readLine());Queue<Integer> q = new LinkedList<Integer>();
		int x =n/5;
		int ix =x;
		int z =1;
		while (ix-z>0)
		{	ix-=z;
			z++;
		}
			
		int y = ix*5;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<z;j++)
			{
				q.add(i+1);
			}
		}
		for(int i=y;i<n;i++)
		{
			int b=q.poll();
			q.add(b);
			q.add(b);
		}
		switch(q.poll())
		{
		case 1:System.out.println("Sheldon");break;
		case 2:System.out.println("Leonard");break;
		case 3:System.out.println("Penny");break;
		case 4:System.out.println("Rajesh");break;
		case 5:System.out.println("Howard");break;
		}
		
	}
}
