package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A490TeamOlympiad 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 ArrayList<Integer> arr1 = new ArrayList<Integer>();
		 ArrayList<Integer> arr3 = new ArrayList<Integer>();
		 ArrayList<Integer> arr2 = new ArrayList<Integer>();
		 String line [] = br.readLine().split(" ");
		 
		 for(int i=0;i<n;i++)
		 {
			 switch (Integer.parseInt(line[i]))
			 {
				 case 1 : arr1.add(i+1);break;
				 case 2 : arr2.add(i+1);break;
				 case 3 : arr3.add(i+1);break;
			 }
		 }
		 int c =0;
		 StringBuilder sb = new StringBuilder("");
		 while(!arr1.isEmpty()&&!arr2.isEmpty()&&!arr3.isEmpty())
		 {c++;
			 sb.append(arr1.remove(0)+" "+arr2.remove(0)+" "+arr3.remove(0)+"\n");
			 
		 }
		 System.out.println(c);if(sb.length()!=0)System.out.println(sb);
	}	
}
