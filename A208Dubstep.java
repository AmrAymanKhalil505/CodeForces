package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A208Dubstep {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String 	line[] =br.readLine().split("WUB");
	PrintWriter out = new PrintWriter(System.out);
	for(int i=0;i<line.length;i++)
	{if(line[i].length()!=0)
		out.append(line[i]+" ");
	}
	out.flush();out.close();
		
	}
}
