package CodeForces;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A136Presents {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x []=new int [Integer.parseInt(br.readLine())];
		String line []=br.readLine().split(" ");PrintWriter out= new PrintWriter(System.out);
		for(int i=0;i<x.length;i++)
		{
			x[Integer.parseInt(line[i])-1]=i+1;
			
		}
		for(int i=0;i<x.length;i++)
		{
			out.append(""+x[i]+" ");
		}
		out.flush();out.close();
		
	}}
