package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A313IlyaandBankAccount {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		 int x0 =Integer.parseInt(br.readLine());
		 int x1 =x0/10;
		 int x2 = x0%10 +( x0/100)*10;
		 int out = Math.max(Math.max(x0, x1), x2);
		 System.out.println(out);
	}
}
