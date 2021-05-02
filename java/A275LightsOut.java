package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class A275LightsOut
{
	public static void main(String[] args) throws IOException 
	{	int xA []={0, 1, 0,-1, 0};
		int yA []={0, 0, 1, 0,-1};
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int in [][] = new int [3][3];int outp [][]= new int [3][3];
		for(int i=0;i<3;i++)
		{	String line []=br.readLine().split(" ");
			for(int j=0;j<3;j++)
			{
				in[i][j]=Integer.parseInt(line[j]);
				outp[i][j]=1;
			}
			
		}
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				if(in[i][j]%2!=0)
				{	
					for(int k=0;k<5;k++)
					{
						int x =xA[k]+j;
						int y =yA[k]+i;
						if(x<0||x>2)
							continue;
						if(y<0||y>2)
							continue;
						outp[y][x]=1-outp[y][x];
					}
				}
			}
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<3;i++)
		{	
			for(int j=0;j<3;j++)
			{
				
				sb.append(outp[i][j]);
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}
}
