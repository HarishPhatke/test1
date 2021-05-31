package com.practice.assignment3;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,3,3,4};
		
		uniqueNumber(arr);

	}
	
	public static void uniqueNumber(int arr[])
	{
		int i,j;
		int length=arr.length;
		System.out.println("unique numbers");
		for(i=0;i<length;i++)
		{
			for(j=0;j<i;j++)
			
				if(arr[i]==arr[j])
				
					break;
			
				
				if(i==j)
				
					System.out.print(arr[i]+" ");
				
			}
		}
	}


