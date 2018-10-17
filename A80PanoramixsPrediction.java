package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A80PanoramixsPrediction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	String line[] = br.readLine().split(" " );
	int n =Integer.parseInt(line[0]);
	int m=Integer.parseInt(line[1]);
	boolean f=true;
	for(int i=n+1;i<m;i++)
	{
		if(isPrime (i))
		{	f=false;
			break;
		}
	}
	if(f&&isPrime(m))
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	}

	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
