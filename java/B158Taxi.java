package CodeForces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class B158Taxi
{static PrintWriter pw = new  PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int TC =Integer.parseInt(br.readLine());
			String Sline []= br.readLine().split(" ");
			int ones =0;
			int two = 0;
			int three=0;
			int four =0;
			for(int i=0;i<TC;i++)
			{ int x =Integer.parseInt(Sline[i]);
				switch(x)
				{
					case 1: ones++;break;
					case 2: two++;break;
					case 3: three++;break;
					case 4: four++;break;
				}
					
			}
			int r=0;
			r+=four;//System.out.println(r);
			r+=three;//System.out.println(r);
			ones-=three;
			if(ones<0)
				ones =0;
			
			int remOf2 = two%2;
			r+=two/2;//System.out.println(r);
			
			remOf2*=2;
			
			ones+=remOf2;
			
			int remOf1 = ones%4;
			r+=ones/4;//System.out.println(r);
			if(remOf1>0)
			{
				r++;
			}
			
			System.out.println(r);
		}
		
}
