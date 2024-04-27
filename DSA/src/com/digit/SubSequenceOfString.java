package com.digit;

public class SubSequenceOfString {
	public static void main(String[] args) {
		
		int L=3;
		int R=7;
		findXOR(L, R);
	}
	
	public static int findXOR(int L, int R){
        // Write your code here.

        int leftXOR=0;
        int rightXOR=0;
        int finalAns=0;

        leftXOR = L % 4;
        if(leftXOR ==0)
                leftXOR = L;
        else if(leftXOR ==1)
                leftXOR =1;
        else if(leftXOR ==2)
                leftXOR = L +1;

        else if(leftXOR ==3)
                leftXOR =0;   

                rightXOR = R %4;    
         if(rightXOR ==0)
                rightXOR = R;
        else if(rightXOR ==1)
                rightXOR =1;
        else if(rightXOR ==2)
                rightXOR = R +1;

        else if(rightXOR ==3)
                rightXOR =0;   

        return (leftXOR ^ rightXOR)^L ;


    }
}
