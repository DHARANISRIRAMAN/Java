package org.array;

public class TwoArray {
	public static void main(String[] args) {
		//datatype var[]	= new datatype[size]
		
		//index(0 to n-1)= value(1 to n)
		int a[][]= new int [3][3];
		a[0][0]=90;
		a[1][1]=80;	
		a[0][2]=70;
		a[1][0]=60;
		a[1][1]=50;
		a[1][2]=40;
		a[2][0]=30;
		a[2][1]=20;
		a[2][2]=10;
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
		for(int [] b:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}
				
		
			
			  
		}
		
		
	}      
	