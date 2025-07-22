package Recursion;

public class Count_Digits_in_a_Number {
/*
Count Digits in a Number
Difficulty: EasyAccuracy: 42.13%Submissions: 90K+Points: 2
You are given a number n. You need to find the count of digits in n.

Examples :

Input: n = 1
Output: 1
Explanation: Number of digit in 1 is 1.
Input: n = 99999
Output: 5
Explanation: Number of digit in 99999 is 5
Constraints:
1 ≤ n ≤ 109
 */


    public static int countDigits(int n) {
        // Using Loop

        // int count=0;

        // while(n>0){
        //     int last=n%10;
        //     n=n/10;
        //     count++;
        // }

        // return count;





        //using recursion


        if(n==0) return 0;
        return 1+countDigits(n/10);


    }
}
