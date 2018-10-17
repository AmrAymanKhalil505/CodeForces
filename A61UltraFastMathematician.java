package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A61UltraFastMathematician {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line1 =br.readLine();
		PrintWriter out = new PrintWriter(System.out);
		String line2 = br.readLine();
		for(int i=0;i<line1.length();i++)
		{
			if(line1.charAt(i)!=line2.charAt(i))
				out.append('1');
			else
				out.append('0');
		}
		out.flush();out.close();
	}
}
