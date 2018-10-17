package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A41Translation {
public static void main(String[] args) throws IOException {
	BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
	String line1 =br.readLine();
	String line2= br.readLine();
	boolean f=false;
	if(line1.length()==line2.length())
	{
		for(int i=0;i<line1.length();i++)
		{
			if(line1.charAt(i)!=line2.charAt(line2.length()-i-1))
			{
				f=true;break;
			}
		}
		if(!f)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	else
	{
		System.out.println("NO");
	}
}
}
