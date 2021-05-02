package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A155I_love_username {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		String line []=br.readLine().split( " ");
		int max= Integer.parseInt(line[0]);
		int min=Integer.parseInt(line[0]);
		int c=0;
		for(int i=1;i<n;i++)
		{int t =Integer.parseInt(line[i]);
			if(t>max)
			{
				max=t;
						c++;
			}
			else if(t<min)
			{min=t ;
			c++;
				
			}
			
		}
		System.out.println(c);
		
	}
}
