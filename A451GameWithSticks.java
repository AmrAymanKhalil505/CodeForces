package CodeForces;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class A451GameWithSticks {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line []=br.readLine().split( " ");
			int n = Integer.parseInt(line[0]);
			int m= Integer.parseInt(line[1]);
			
			Boolean Ak =true;
			while(n!=0&&m!=0)
			{
				n--;
				m--;
				Ak=!Ak;
			}
			if(Ak)
				System.out.println("Malvika");
			else
				System.out.println("Akshat");
			
		}
	}
