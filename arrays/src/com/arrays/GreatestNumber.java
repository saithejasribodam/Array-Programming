package com.arrays;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {22,3,4,55,67,-34};
    int great=0;
    int secgreat=0,thirdgreat=0;
    for(int i=0;i<arr.length;i++)
    {
    	int n=arr[i];
    	if(n>great)
    	{
    		thirdgreat=secgreat;
    		secgreat=great;
    		great=n;
    	}
    	else if(n>secgreat)
    			secgreat=n;
    	else if(n>thirdgreat)
    		thirdgreat=n;
    		
    		 
        }
    System.out.println(thirdgreat);
	}

}
