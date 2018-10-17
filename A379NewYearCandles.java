package CodeForces;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class A379NewYearCandles {
		public static void main(String[] args) throws IOException {
			BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
			String line []=br.readLine().split(" " );
			int n = Integer.parseInt(line[0]);int m =Integer.parseInt(line[1]);
			int r =n;int rem=0;
			while(n>0)
			{
				r+=n/m;
				rem+=n%m;
				n=n/m;
				
						
			}
			r+=rem/m;
			System.out.println(r);
		}
	}
