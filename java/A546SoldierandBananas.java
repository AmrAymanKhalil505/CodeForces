package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A546SoldierandBananas {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String l []= br.readLine().split(" ");
		int k = Integer.parseInt(l[0]);
		int n =Integer.parseInt(l[1]);
		int w =Integer.parseInt(l[2]);
		int m=0;
		for(int i=1;i<=w;i++)
		{
			m+=i*k;
		}
		if(m-n>0)
		System.out.println(m-n);
		else
			System.out.println(0);
	}
}
