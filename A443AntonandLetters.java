package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class A443AntonandLetters
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		line = line.substring(1, line.length()-1);
		String set [] = line.split(", ");
		int c =0;
		ArrayList<String > arr = new ArrayList<String >();
			for(int i=0;i<set.length;i++)
			{
				arr.add(set[i]);
			}
			Collections.sort(arr);
			int out =1;
			for(int i=1;i<arr.size();i++)
			{
				if(!arr.get(i).equals(arr.get(i-1)))
				{
					out++;
				}
			}
			if(line.isEmpty())
				out=0;
			System.out.println(out);
	}
}
