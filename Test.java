package com.practice.assignment3;

public class Test {

	public static void main(String[] args) {
		int i,j,k=7,h=6,x=5,y=4,z=3,w=2;
		for(i=0;i<=6;i++)
		{
			for (j=0;j<=6;j++)
			{
				if(i==0&&j<=6)
				{
					System.out.print(k);
					k--;
				}
				if(i==1&&j<=5)
				{
					System.out.print(h);
					h--;
				}
				if(i==2&&j<=4)
				{
					System.out.print(x);
					x--;
				}
				if(i==3&&j<=3)
				{
					System.out.print(y);
					y--;
				}
				if(i==4&&j<=2)
				{
					System.out.print(z);
					z--;
				}
				if(i==5&&j<=1)
				{
					System.out.print(w);
					w--;
				}
				
				if(i==6&&j==0)
				{
					System.out.print(1);
					
				}
					
			}
			System.out.println();
		}

	}

}
