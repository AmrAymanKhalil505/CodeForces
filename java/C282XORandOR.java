package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C282XORandOR {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b1 = br.readLine();
		String b2 = br.readLine();
		boolean f = true;
		
		if (b1.length() == b2.length()) {
			if(b1.length()==1)
			{
					if(b1.equals(b2))
					{
						System.out.println("YES");
					}
					else
					{
						System.out.println("NO");
					}
			}
			else{
			if (b1.charAt(0) == '0'
					&& b1.charAt(1) == '0') {
				if (b2.charAt(0) != '0'
						|| b2.charAt(1) != '0') {
					f = false;}}
			for (int i = 1; i < b1.length()-1; i++) {
				if (b1.charAt(i) == '0'
						&& b1.charAt(i+1) == '0') {
					if (b2.charAt(i) != '0'
							|| b2.charAt(i+1) != '0') {
						f = false;
						break;
					}
				}
			}
			if (b1.charAt(b1.length()-2) == '0'
					&& b1.charAt(b1.length()-1) == '0') {
				if (b2.charAt(b1.length()-2) != '0'
						|| b2.charAt(b1.length()-1) != '0') {
					f = false;}}
			if (f) {
				System.out.println("YES");

			} else {
				System.out.println("NO");
			}
		}
		}
		 else {
			System.out.println("NO");
		}
	}

	char xor(char x, char y) {
		if (x == y)
			return '0';
		return '1';

	}

	char or(char x, char y) {
		if (x == '1' || y == '1') {
			return '1';
		}
		return '0';
	}
}
