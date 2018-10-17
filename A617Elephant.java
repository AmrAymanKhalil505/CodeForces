package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A617Elephant {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int Step =Integer.parseInt(br.readLine());int r=0;
		r+=Step/5;
		Step=Step%5;
		if(Step!=0)
		System.out.println(r+1);
		else
			System.out.println(r);
	}
}
