package Array;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []aryNums = new int[6];
	int i;
	int ave = 0;
	
	aryNums [0] = 123;
	aryNums [1] = 456;
	aryNums [2] = 479;
	aryNums [3] = 135;
	aryNums [4] = 246;
	aryNums [5] = 135;
	
	Arrays.sort(aryNums);
	
	for(i=0; i< aryNums.length;i++)
	{
		ave = ave + aryNums[i];
		System.out.print(aryNums[i] + ", ");
	}
	
	System.out.println("Total: " + (ave/6));
	
	}

}
