package com.sunny;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class Two_Sum {

	public static void main(String[] args) {
		int [] test = {0,4,3,0};
//		int [] re = twoSum(test,0);
//		System.out.println(Arrays.toString(re));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Hashtable<Integer, Integer> hs = new Hashtable<Integer, Integer>();
		int [] re = {0,0};
		for(int i = 0;i<nums.length;i++){
			Integer need = target - nums[i];
			Integer value = hs.get(need);
			if(value == null){hs.put(nums[i], i);}
			else {
				re[0] = value;
				re[1] = i;
				break;
			}
		}
		return re;
	}
	
	
//    public static int[] twoSum(int[] nums, int target) {  	
//    	int a = 0;
//    	int b = nums.length - 1;
//    	int [] newArray = nums.clone();
//    	quickSort(nums,a,b);
//    	int sum = 0;
//    	while(a<b)
//    	{
//    		sum = nums[a]+nums[b];
//    		if(sum>target)
//    		{
//    			b--;
//    		}
//    		if(sum<target)
//    		{
//    			a++;
//    		}
//    		if(sum==target)
//    		{
//    			a = nums[a];
//    			b = nums[b];
//    			break;
//    		}
//    	}
//    	int[] re = {findNumber(newArray,a),findNumber(newArray,b)};
//		return re;
//    }
    
//    public static int findNumber(int [] nums,int find){
//    	int re = -1;
//    	for(int i = 0; i <nums.length ; i++){
//    		if(nums[i]== find){
//    			re = i;
//    		}
//    	}
//    	return re;
//    }
//    
//    public static void quickSort(int[] numbers, int start, int end) {   
//        if (start < end) {   
//            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
//            int temp; // 记录临时中间值   
//            int i = start, j = end;   
//            do {   
//                while ((numbers[i] < base) && (i < end))   
//                    i++;   
//                while ((numbers[j] > base) && (j > start))   
//                    j--;   
//                if (i <= j) {   
//                    temp = numbers[i];   
//                    numbers[i] = numbers[j];   
//                    numbers[j] = temp;   
//                    i++;   
//                    j--;   
//                }   
//            } while (i <= j);   
//            if (start < j)   
//                quickSort(numbers, start, j);   
//            if (end > i)   
//                quickSort(numbers, i, end);   
//        }   
//    }  

}
