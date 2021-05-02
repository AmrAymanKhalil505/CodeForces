package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A479Expression {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int x []= new int [3];
		x[0]=Integer.parseInt(br.readLine());
		x[1]=Integer.parseInt(br.readLine());
		x[2]=Integer.parseInt(br.readLine());
		int max=0;
		
					for(int a=0;a<2;a++)
						for(int b=0;b<2;b++)
						{
						
							{
								if(a==0&&b==0)
									max= Math.max(x[0]+x[1]+x[2],max);
								else if (a==0&&b==1){
									max=Math.max((x[0]+x[1])*x[2], max);
									max=Math.max(x[0]+x[1]*x[2], max);
								}
								else if(a==1&&b==0){
									max=Math.max((x[0]*x[1])+x[2], max);
									max=Math.max(x[0]*(x[1]+x[2]), max);
								}
								else if(a==1&&b==1)
									max=Math.max(x[0]*x[1]*x[2], max);
							
							}
						
							
						}
		
		System.out.println(max);
	}
		
	}

/*
int x []= new int [3];
x[0]=Integer.parseInt(br.readLine());
x[1]=Integer.parseInt(br.readLine());
x[2]=Integer.parseInt(br.readLine());
int max=0;
for(int i=0;i<3;i++)
{
	for(int a=0;a<2;a++)
	{
		for(int k=0;k<3;k++)
		{
			for(int b=0;b<2;b++)
			{
				for(int q=0;q<3;q++)
				{
					if(q!=k&&q!=i&&i!=k)
					{
						if(a==0&&b==0)
							max= Math.max(x[i]+x[k]+x[q],max);
						else if (a==0&&b==1)
							max=Math.max(x[i]+x[k]*x[q], max);
						else if(a==1&&b==0)
							max=Math.max(x[i]*x[k]+x[q], max);
						else if(a==1&&b==1)
							max=Math.max(x[i]*x[k]*x[q], max);
						
					}
					}
				}
			}
		}
	}
System.out.println(max);		*/