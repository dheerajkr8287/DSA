package MathQuestion;

public class LCM_GCD {
    /*
    LCM And GCD
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.

Example 1:

Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: 56 2
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Expected Time Complexity: O(log(min(a, b))
Expected Auxiliary Space: O(1)

Constraints:
1 <= a, b <= 109
     */



    class Solution {
        static Long[] lcmAndGcd(Long A , Long B) {
            // code here
            Long[] ans=new Long[2];
            long gcd=0;
            long m=A*B;
            while(A>0&&B>0){
                if(A>B){
                    A=A%B;
                }
                else{
                    B=B%A;
                }

            }
            if(A==0){
                gcd= B;
            }
            else{
                gcd= A;
            }

            ans[0]=m/gcd;
            ans[1]=gcd;
            return ans;

        }
    };
}
