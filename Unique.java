package com.practice.assignment3;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,3,3,4};
		
		FinduniqueNumber(a);

	}
	
	public static void FinduniqueNumber(int a[])
	{
		int i,j;
		int length=a.length;
		System.out.println("unique numbers");
		for(i=0;i<length;i++)
		{
			for(j=0;j<i;j++)
			
				if(a[i]==a[j])
				
					break;
			
				
				if(i==j)
				
					System.out.print(a[i]+" ");
				
			}
		}
	}


