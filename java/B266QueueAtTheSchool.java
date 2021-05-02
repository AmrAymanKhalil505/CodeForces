package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class B266QueueAtTheSchool {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String l[] = br.readLine().split(" ");
		int n =Integer.parseInt(l[0]);
		int t =Integer.parseInt(l[1]);
		String line = br.readLine();
		 char x []=line.toCharArray();
		
		for(int i=0;i<t;i++)
		{for(int j=0;j<x.length;j=j)
		{
			if(j+1<x.length&&x[j]=='B'&&x[j+1]=='G')
			{
				x[j]='G';
				x[j+1]='B';
				j+=2;
			}
			else
			{
				j++;
			}
		}
		
		}PrintWriter out = new PrintWriter(System.out);
		for(int i=0;i<x.length;i++)
		{
			out.append(x[i]);
		}
out.flush();out.close();		
	}
}
