package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A344Magnets {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());String last="00";
		int max=0;int c=1;String line;
		while(n-->0)
		{if(!last.equals(line=br.readLine()))
			max++;
		last =line;
		}System.out.println(max);
	}
}
