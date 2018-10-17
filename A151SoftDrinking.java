package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A151SoftDrinking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line []=br.readLine().split(" " );
		int n =Integer.parseInt(line[0]);
		int k =Integer.parseInt(line[1]);
		int l=Integer.parseInt(line[2]);
		int c=Integer.parseInt(line[3]);
		int d=Integer.parseInt(line[4]);
		int myc=d*c;
		int p=Integer.parseInt(line[5]);
		
		int nl=Integer.parseInt(line[6]);
		int nnl=nl*n;
		int np=Integer.parseInt(line[7]);
		int nnp=np*n;
		
		int thec=myc/n;
		int thep=p/nnp;
		int thel=l*k/nnl;
		
		int r=Math.min(thec, Math.min(thep, thel));
		System.out.println(r);
	}
}
