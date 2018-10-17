package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C523NameQuest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 =br.readLine();
		String line2 =br.readLine();
		
		int j=0;
		int s1=-1;
		int s2=-1;
		
		for(int i=0;i<line2.length();i++)
		{
			if(line2.charAt(i)==line1.charAt(j))
			{	
				j++;
				if(j==line1.length())
				{
					s1=i;
					break;
				}
				
			}
		} j--;
		for(int i=line2.length()-1;i>0;i--)
		{
			if(line2.charAt(i)==line1.charAt(j))
			{	
				j--;
				
				if(j==-1)
				{
				s2=i;
				break;
				}
			
				
			}
		}
		if(s1!=-1&&s2!=-1&&(s2-s1)>=0)
		System.out.println(s2-s1);
		else
			System.out.println(0);
	}
}
