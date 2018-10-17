package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A315SerejaandBottles 
{static final int opened = -1 ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arrHead[]= new int [N];
		int arrCanOpen[] = new int [N];
		for (int i= 0;i<N;i++)
		{
			String line [] =br.readLine().split(" ");
			arrHead[i]=Integer.parseInt(line[0]);
			arrCanOpen[i]=Integer.parseInt(line[1]);
			
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i!=j)
				{
					if(arrHead[i]==arrCanOpen[j])
					{
						arrHead[i]=opened;
					}
				}
			}
		}
		int c=0;
		for (int i= 0;i<N;i++)
		{
			if(arrHead[i]!=opened)
				c++;
		}	

	System.out.println(c);}

}
