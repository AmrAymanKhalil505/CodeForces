package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A459PashmakandGarden {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line []=br.readLine().split(" ");
		int x3= Integer.parseInt(line[0]);
		int y3=Integer.parseInt(line[1]);
		int x4 = Integer.parseInt(line[2]);
		int y4 =Integer.parseInt(line[3]);
		int x1;
		int x2;
		int y1;
		int y2;
		if (x3==x4)
		{int d =Math.abs(y3-y4);
		x1=x3+d;
		x2=x4+d;
		y1=y3;
		y2=y4;
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
		}
		else if(y3==y4)
		{
			int d=Math.abs(x4-x3);
			y1=y3+d;y2=y4+d;
			x1=x3;x2=x4;
			System.out.println(x1+" "+y1+" "+x2+" "+y2);
		}
		else {
			if(Math.abs(x3-x4)==Math.abs(y3-y4))
			{
				x1=x3;
				y1=y4;
				x2=x4;
				y2=y3;
				System.out.println(x1+" "+y1+" "+x2+" "+y2);
			}
			else
				System.out.println("-1");
		}
	}
}
