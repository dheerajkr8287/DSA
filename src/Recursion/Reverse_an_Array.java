package Recursion;

public class Reverse_an_Array {
    /*
    Reverse an Array
Difficulty: EasyAccuracy: 55.32%Submissions: 29K+Points: 2
You are given an array of integers arr . Your task is to reverse the given array and return the reversed array.

Examples:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1<=arr.size()<=105
0<=arr[i]<=105
     */

    class Solution {
        int i=0;
        public void reverseArray(int arr[]) {
            // code here

            int n=arr.length;

            if(i==n/2){
                return ;
            }

            int swap=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=swap;
            i++;



            reverseArray( arr);



        }
    }
}
