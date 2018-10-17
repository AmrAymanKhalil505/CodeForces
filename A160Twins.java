package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class A160Twins {
public static void main(String[] args) throws IOException {
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	br.readLine();
	String [] line =br.readLine().split(" ");
	ArrayList<Integer> list =new ArrayList<Integer>();
	double t=0;int x=0;
	for(int i=0;i<line.length;i++)
	{x=Integer.parseInt(line[i]);
	t+=x;
		list.add(x);
	}
	Collections.sort(list);
	t=t/2;int m=0;
	for(int i=list.size()-1;i>=0;i--)
	{m+=list.get(i);
	if(m>t)
	{
		System.out.println(list.size()-i);
		break;
	}
		
	}
	
}
}
