package CodeForces;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A271BeautifulYear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String line =br.readLine();
	
		
		for(int k=Integer.parseInt(line)+1;k<100000;k++)
		{boolean f=true;String num = k+"";
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<4;j++)
			{
				if(num.charAt(i)==num.charAt(j))
				{
					f=false ; break;
				}
			}
		}
		if(f)
		{
			System.out.println(k);break;
		}
		}
	}

}
