package MathQuestion;

import java.util.Arrays;

public class find_GCD_of_Array {

    /*
    1979. Find Greatest Common Divisor of Array

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.



Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
Example 3:

Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.


Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000
     */

//    brute force------>O(nlogn + log(min));


//import java.util.Arrays;
    class Solution {
        public int findGCD(int[] nums) {
            int gcd=0;
            Arrays.sort(nums);
            int min=nums[0];
            int max=nums[nums.length-1];

            while(min>0&& max>0){
                if(min>max){
                    min=min%max;

                }else{
                    max=max%min;
                }

            }

            if(min==0){
                gcd=max;

            }
            else{
                gcd=min;
            }
            return gcd;

        }
    }




    //optimal solutions:O(n + log(min))

    class Solutions {
        public int findGCD(int[] nums) {
            int gcd=0;
            // Arrays.sort(nums);
            // int min=nums[0];
            // int max=nums[nums.length-1];


            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                }
                if(nums[i]>max){
                    max=nums[i];
                }
            }

            while(min>0&& max>0){
                if(min>max){
                    min=min%max;

                }else{
                    max=max%min;
                }

            }

            if(min==0){
                gcd=max;

            }
            else{
                gcd=min;
            }
            return gcd;

        }
    }




}
