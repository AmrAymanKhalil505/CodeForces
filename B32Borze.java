package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class B32Borze {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line = br.readLine();PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)=='.')
			{
				out.append('0');
			}
			else if(line.charAt(i)=='-')
			{
				i++;
				if(line.charAt(i)=='.')
				{
					out.append('1');
				}
				else
				{
					out.append('2');
				}
			}
		}
		out.flush();out.close();
	}
}
