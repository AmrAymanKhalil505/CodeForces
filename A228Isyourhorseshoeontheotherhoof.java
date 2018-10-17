package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A228Isyourhorseshoeontheotherhoof {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String line []=br.readLine().split(" " );
		int c=0;
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<4;j++)
			{
				if(line[i].equals(line[j]))
				{
					c++;break;
				}
			}
		}
		System.out.println(c);
	}
}
