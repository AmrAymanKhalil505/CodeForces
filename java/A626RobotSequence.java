package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A626RobotSequence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String line =br.readLine();int r =0;
		for (int i=0;i<n;i++)
		{int x=0;
		int y=0;
			for(int j =i;j<n;j++)
			{
				switch (line.charAt(j))
				{
					case 'U':y++;break;
					case 'D':y--;break;
					case 'R':x++;break;
					case 'L':x--;break;
				}
				if(x==0&&y==0)
				{	
					r++;
				}
				
			}
			
		}
		System.out.println(r);
	}
}
