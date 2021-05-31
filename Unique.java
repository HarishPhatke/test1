package com.practice.assignment3;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		int i,j,count,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) 
		{
			arr[i] = s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
