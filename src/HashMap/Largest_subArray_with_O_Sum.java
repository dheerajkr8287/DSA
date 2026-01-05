package HashMap;

import java.util.HashMap;

public class Largest_subArray_with_O_Sum {
/*
Difficulty: MediumAccuracy: 41.84%Submissions: 447K+Points: 4Average Time: 20m
Given an array arr[] containing both positive and negative integers, the task is to find the length of the longest subarray with a sum equals to 0.

Note: A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order.

Examples:

Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
Output: 5
Explanation: The longest subarray with sum equals to 0 is [-2, 2, -8, 1, 7].
Input: arr[] = [2, 10, 4]
Output: 0
Explanation: There is no subarray with a sum of 0.
Input: arr[] = [1, 0, -4, 3, 1, 0]
Output: 5
Explanation: The longest subarray with sum equals to 0 is [0, -4, 3, 1, 0]
Constraints:
1 ≤ arr.size() ≤ 106
−103 ≤ arr[i] ≤ 103


 */

    // t.c ==o(n) ---> optimal approach

    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        // <prefixSum,index>
        int maxlength=0;
        int prefixSum=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefixSum=prefixSum+arr[i];
            if(mp.containsKey(prefixSum)){
                maxlength=Math.max(maxlength,i-mp.get(prefixSum));
            }else{
                mp.put(prefixSum,i);
            }
        }

        return maxlength;

    }
}
