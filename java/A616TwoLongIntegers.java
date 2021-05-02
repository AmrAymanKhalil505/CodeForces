package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A616TwoLongIntegers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s1=new StringBuilder(br.readLine());
		StringBuilder s2=new StringBuilder(br.readLine());StringBuilder a=new StringBuilder();
		if(s1.length()>s2.length())
		{
		 int d=s1.length()-s2.length();
		 
		 for(int i=0;i<d;i++)
		 {
			 a.append("0");
		 }
		 s2.insert(0, a);
		}
		else if (s1.length()<s2.length()){
			int d=s2.length()-s1.length();
		 
		 for(int i=0;i<d;i++)
		 {
			 a.append("0");
		 }
		 s1.insert(0, a);
	}boolean f = false;
		for(int i=0;i<s1.length();i++)
		{
			if(Integer.parseInt(s1.charAt(i)+"")>Integer.parseInt((s2.charAt(i)+"")))
					{f =true;
				System.out.println(">");
				break;
					}
			else if(Integer.parseInt(s1.charAt(i)+"")<Integer.parseInt((s2.charAt(i)+""))){
				f =true;
				System.out.println("<");
				break;
			}
			
		}
		if (!f)
		{
			System.out.println("=");
		}
		
	}
}
