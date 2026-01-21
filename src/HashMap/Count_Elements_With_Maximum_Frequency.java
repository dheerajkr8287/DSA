package HashMap;

public class Count_Elements_With_Maximum_Frequency {

    /*
    3005. Count Elements With Maximum Frequency

You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.



Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
     */


    //BRUTE FORCE

    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        boolean visted[]=new boolean[n];
        int maxFreq=0;

        for(int i=0;i<n;i++){
            if(visted[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){

                if(nums[i]==nums[j]){
                    visted[j]=true;
                    count++;
                }
            }

            if(count>maxFreq){
                maxFreq=count;
            }


        }

        int result=0;
        visted=new boolean[n];
        for(int i=0;i<n;i++){
            if(visted[i]){
                continue;
            }

            int count=1;
            for(int j=i+1;j<n;j++){

                if(nums[i]==nums[j]){
                    visted[j]=true;
                    count++;
                }
            }

            if(count==maxFreq){
                result=result+count;
            }
        }

        return result;




    }


    //OPTIAML CODE

    // public int maxFrequencyElements(int[] nums) {
    //      int n=nums.length;

    //     HashMap<Integer,Integer> mp=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    //     }

    //     int maxFreq=0;

    //     for(Map.Entry<Integer,Integer> entry:mp.entrySet()){

    //          int freq=entry.getValue();
    //          if (freq>maxFreq) {

    //             maxFreq=freq;



    //         }


    //     }

    //     int count=0;
    //     for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
    //         int freq=entry.getValue();
    //         if(freq==maxFreq){
    //             count=count+freq;
    //         }

    //     }


    //     return count;

    // }
}



/*
Algorithm Reality Checks

Big-O shows growth, not speed.

Small input → constant factors matter more.

Brute force can beat optimal when n is small.

HashMap is O(1) on paper, not free in reality.

Arrays are faster than objects.

Less abstraction = faster execution.*/