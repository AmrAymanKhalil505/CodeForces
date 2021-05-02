package CodeForces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class B230Tprimes 
{	static boolean primes []= new boolean [(int) (1e7 +10)];
	static long lmt = (int) (1e7 +10);
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		PrintWriter pw =new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String line []= br.readLine().split(" ");
		primes[1]=true;
		primes[0]=true;
		PrimeGen();
		for(int i=0;i<TC;i++)
		{
			long x =Long.parseLong(line[i]);
		//	System.out.println(x);
			long z=(long) Math.sqrt(x);
	//		System.out.println((int) z);
			if(!primes[(int) z]&&(z*z) == x)
			{
				pw.println("YES");
			}
			else
			{
				pw.println("NO");
			}
		}
		pw.flush();
		pw.close();
	}
	static void PrimeGen ()
	{	
		for(int i=2;i<3163;i++)
		{   if(!primes[i])
			for(int j=i*i;j<lmt;j+=i)
			{
				primes[j]=true;
					
			}
		}
		
	}
}
