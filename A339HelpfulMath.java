package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class A339HelpfulMath {
	public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	PrintWriter out =new PrintWriter(System.out);
	String line = br.readLine();
int	nums []  = MySplit(line);

Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++)
{
out.append(nums[i]+"+");	
}out.append(nums[nums.length-1]+"");
out.flush();
out.close();
	}

	private static int []MySplit(String line) {
		// TODO Auto-generated method stub
		int nums []=new int [line.length()/2+1];
		int j=0;
		for (int i=0;i<line.length();i+=2)
		{
			nums[j]=Integer.parseInt(line.charAt(i)+"");
			j++;
		}
		return nums;
	}
}
