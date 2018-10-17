package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A472DesignTutorialLearnfromMath {
	static int nums []= new int [(int) (1e6+5)];
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
	int n =Integer.parseInt(br.readLine());
	for(int i=4;i<n;i++)
	{	
		if(!isPrime(i)&&!isPrime(n-i))
		{
			System.out.println(i+ " "+(n-i));
			break;
		}
	}
}

private static boolean isPrime(int n) {
	if(nums[n]!=0)
	{
		return nums[n]==1;
	}
	else
		for(int i=2;i<n/2+1;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
	return true;
}
}
