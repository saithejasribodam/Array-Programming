package com.arrays;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {22,109,-76,94,65};
int key=56;
for(int i=0;i<=arr.length-1;i++)
{
	if(key==arr[i])
	{
          	System.out.println("found");
	         return;
	}
	}
System.out.println("not found");
}
}