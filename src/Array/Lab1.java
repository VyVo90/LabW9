package Array;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []aryNums = new int[6];
	
	aryNums [0] = 123;
	aryNums [1] = 456;
	aryNums [2] = 479;
	aryNums [3] = 135;
	aryNums [4] = 246;
	aryNums [5] = 135;
	
	int i;
	int aryTotal = 0;
	int ave = 0;
	
	Arrays.sort(aryNums);
	
	for(i=0; i< aryNums.length;i++)
	{
		aryTotal = aryTotal + aryNums[i];
	}
	
	ave = aryTotal / 6;
	System.out.println("Total: " + ave);
	
	}

}
