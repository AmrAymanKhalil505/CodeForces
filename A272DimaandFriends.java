package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A272DimaandFriends {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		 int  n = Integer.parseInt(br.readLine())+1;
		 String line []=br.readLine().split(" ") ;
		 int z = 0;
		 for(int i=0;i<line.length;i++)
		 {
			 int x = Integer.parseInt(line[i]);
			 z=z%n+x%n;
			 z=z%n;
			 
		 }
		 int c =0;
		 int orz = z;
		 for(int i=0;i<5;i++)
		 {
			 z=z%n+i%n;
			 z=z%n;
			 if(z!=0)
			 {
				c++;
			 }
			 z =orz;
		 }
		 System.out.println(c);
		 
	}
}
