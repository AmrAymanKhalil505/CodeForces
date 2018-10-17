package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A330CakeMinator {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line []=br.readLine().split(" ");
			int r =Integer.parseInt(line[0]);
			int c =Integer.parseInt(line [1]);
			boolean ru[]= new boolean [r];
			boolean cu[]=new boolean [c];
			String cells [] =new String [r];
			String l ="";
			for(int i=0;i<r;i++)
				cells[i]=	br.readLine();
				
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
				{if(cells[i].charAt(j)=='S')
				{
					ru[i]=true;
					cu[j]=true;
				}
					
				}
			
			StringBuilder taken=new StringBuilder();
			int rus=0;
			for(int i=0;i<c;i++)
			{
				taken.append('q');
			}
			String takenString= taken.toString();
			for(int i=0;i<r;i++)
			{
					if(ru[i]==false)
					{
						cells[i]=takenString;
						rus+=c;
					}
			}
			for(int i=0;i<c;i++)
			{
				if(cu[i]==false)
				{
					for(int j=0;j<r;j++)
					{
						if(cells[j].charAt(i)=='.')
						{
							rus++;
						}
					}
				}
			}
			System.out.println(rus);
		}
}
