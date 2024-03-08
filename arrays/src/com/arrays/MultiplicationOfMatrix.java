package com.arrays;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m1[][]= {{5,1,3},{12,3,64},{3,5,6}};
int m2[][]= {{2,3},{5,100},{8,1}};
int res[][]=new int[m1.length][m2[0].length];
for(int i=0;i<res.length;i++)
{
	for(int j=0;j<m2[0].length;j++)
	{
		for(int k=0;k<m2.length;k++)
		{
			res[i][j]=res[i][j]+m1[i][k]*m2[k][j];
		}
	}
}
for(int i=0;i<res.length;i++)
{
	for(int j=0;j<res[i].length;j++)
	{
		System.out.println(res[i][j]+" ");
	}
	System.out.println();
}
	}

}
