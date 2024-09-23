package org.array2;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int rs=scan.nextInt();
		int cs=scan.nextInt();
		int a[][]=new int[rs][cs];
		for(int i=0;i<rs;i++)
		{
			for(int j=0;j<cs;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
				
		} 
		int fd=0;
		for(int i=0;i<rs;i++)
		{
			for(int j=0;j<cs;j++)
			{
				if(i==j)
				{
					fd=fd+a[i][i];
				}
			}
			System.out.println("FD="+fd);
		}
		
			
			int bd=0;
			for(int i=0;i<rs;i++) 
			{
				for(int j=0;j<cs;j++)
				{
					if(i==cs-1-j)
			           		{
						bd=bd+a[i][i];
					}
			//}
			//	System.out.println("BD"+bd);
		//}
		//	}
	
			
			
		
		
		
	//	}
		
		
		
		
		
		
		

	

 
