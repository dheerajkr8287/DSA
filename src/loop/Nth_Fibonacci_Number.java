package loop;

public class Nth_Fibonacci_Number {
    /*
    Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Note: for the reference of this question take first fibonacci number to be 1.

Examples :

Input: n = 2
Output: 1
Explanation: 1 is the 2nd number of fibonacci series.
Input: n = 5
Output: 5
Explanation: 5 is the 5th number of fibonacci series.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
     */


    class Solution {
        static int nthFibonacci(int n){
            // code here
            int a=0;
            int b=1;
            int c=0;
            int m=1000000007;
            for(int i=2;i<=n;i++){
                c=(a+b)%m;
                a=b;
                b=c;
            }
            return c;
        }
    }

}
