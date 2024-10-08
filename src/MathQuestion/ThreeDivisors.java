package MathQuestion;

public class ThreeDivisors {
    /*
    1952. Three Divisors
Solved
Easy
Topics
Companies
Hint
Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.



Example 1:

Input: n = 2
Output: false
Explantion: 2 has only two divisors: 1 and 2.
Example 2:

Input: n = 4
Output: true
Explantion: 4 has three divisors: 1, 2, and 4.


Constraints:

1 <= n <= 104
     */

    //optimize code in 0ms

    class Solution {
        public boolean isThree(int n) {
            long count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count=count+1;
                }

                if (count > 3) {
                    return false;
                }

            }

            return count<3?false:true;
        }


        /*
        not optimize in 1ms

        class Solution {
            public boolean isThree(int n) {
                long count=0;
                for(int i=1;i<=n;i++){
                    if(n%i==0){
                        count=count+1;
                    }



                }

                if(count==3 ){
                    return true;
                }
                else{
                    return false;
                }
            }
        }*/
    }

}
