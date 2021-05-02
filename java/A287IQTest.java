package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class A287IQTest {
	static String line[];
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		line =new String [4];
		for(int i=0;i<4;i++)
		{
			line[i]=br.readLine();
		}
		boolean f =false;
		for(int i=0;i<4&&!f;i++)
		{
			for(int j=0;j<4&&!f;j++)
			{
			
					if(check(i,j,line[i].charAt(j)))
					{
						f=true;
					}
					
					//System.out.println(i+ " "+j +"  "+ check(i,j,line[i].charAt(j)));
				
			}
		}
		if(f)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	private static boolean check(int i, int j,char mmm) {
		//right top corner
		int rt=0,rd=0,lt=0,ld=0;
		if(j!=3&&line[i].charAt(j+1)==mmm)
		{
			rt++;
			rd++;
		}
		if(j!=0&&line[i].charAt(j-1)==mmm)
		{
			lt++;
			ld++;
		}
		if(i!=3&&line[i+1].charAt(j)==mmm)
		{
			ld++;
			rd++;
			
		}
		if(i!=0&&line[i-1].charAt(j)==mmm)
		{
			lt++;
			rt++;
		}
		if(i!=0&&j!=0&&line[i-1].charAt(j-1)==mmm)
		{
			lt++;
		}
		if(i!=0&&j!=3&&line[i-1].charAt(j+1)==mmm)
		{
			rt++;
		}
		if(i!=3&&j!=3&&line[i+1].charAt(j+1)==mmm)
		{
			rd++;
		}
		if(i!=3&&j!=0&&line[i+1].charAt(j-1)==mmm)
		{
			ld++;
		}
		if(rt>1||rd>1||ld>1||lt>1)
		{//System.out.println(rt+" "+rd+" "+ld+" "+lt);
			return true;
		}
		else 
		{
			return false;
		}
		
	}
}
