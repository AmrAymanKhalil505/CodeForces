package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A527PlayingWithPaper {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		long a=Long.parseLong(line[0]);
		long b=Long.parseLong(line[1]);long r=0;
		while(a>0&&b>0)
		{
			if(a>b)
			{
				r+=a/b;
				a=a%b;
			}
			else
			{r+=b/a;
				b=b%a;
			}
		}
		System.out.println(r);
	}
}
