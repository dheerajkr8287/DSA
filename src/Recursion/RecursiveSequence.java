package Recursion;

/*
A function F is defined as follows F(n)= (1) +(2*3) + (4*5*6) ... upto n terms (look at the examples for better clarity). Given an integer n, determine the F(n).

Note: As the answer can be very large, return the answer modulo 109+7.

Example 1:

Input: n = 5
Output: 365527
Explanation:
F(5) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 = 365527.
Example 2:

Input: n = 7
Output: 6997165

Explanation:
F(7) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 +
16*17*18*19*20*21 + 22*23*24*25*26*27*28 = 6006997207.
6006997207 % 109+7 = 6997165
Your Task:
You do not need to read input or print anything. Your task is to complete the function sequence() which takes an integer n as an input parameter and returns the value of F(n).

Expected Time Complexity: O(n2)
Expected Space Complexity: O(1)

Constraints:
1 ≤ n ≤ 103
 */
public class RecursiveSequence {
    class Solution {

        static long sequence(int n) {

            //BY USING LOOP

            // long sum=0;
            // long i;
            // long j;
            //         long MOD = 1000000007;  // 1e9+7
            //         int current=1;

            // for( i=1;i<=n;i++){
            //     long temp=1;
            //     for( j=1;j<=i;j++){
            //       temp=(temp*current)%MOD;
            //       current++;
            //     }
            //     sum=(sum+temp);
            // }


            // if(sum>1000){
            //     return sum%MOD;
            // }else{
            //     return sum;
            // }


            //BY RECURSIVE

            return sum(1,n,1);








        }

        //helper method

        static long sum(int start ,int M,int current){
            long MOD = 1000000007;
            if(start>M) return 0;
            long product=1;
            for(int i=0;i<start;i++){
                product=(product*current)%MOD;
                current++;
            }

            return (product+sum(start+1,M,current))%MOD;
        }
    }

}
