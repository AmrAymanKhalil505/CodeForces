package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class A609USBFlashDrives 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	int M = Integer.parseInt(br.readLine());
	PriorityQueue<Integer> nums = new PriorityQueue<Integer>(Collections.reverseOrder());
	while(N-->0)
		{
		 nums.add(Integer.parseInt(br.readLine()));
		 
		}
	int c =0;
	while(M>0)
	{
		M-=nums.poll();
		c++;
	}
		System.out.println(c);
	}
}
