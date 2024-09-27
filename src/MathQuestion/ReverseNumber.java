package MathQuestion;

public class ReverseNumber {
    /*
    7. Reverse Integer
Solved
Medium
Topics
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
     */

    class Solution {
        public int reverse(int x) {
            long reverseNum=0;
            while(x!=0){
                int last=x%10;
                x=x/10;
                reverseNum=(reverseNum*10)+last;

            }

            if(reverseNum < Integer.MIN_VALUE || reverseNum> Integer.MAX_VALUE){
                return 0;
            }

            else{
                return (int)reverseNum;


            }
        }
    }


}


/*

-----Explanation of This Approach:-------

Use of long:

reverseNum is declared as a long type to accommodate larger values temporarily, preventing overflow during the calculation.
Overflow Check:

After updating reverseNum, a single overflow check is performed. If the value exceeds the bounds of Integer.MAX_VALUE or Integer.MIN_VALUE, it returns 0.
Casting to int:

Before returning the result, the reverseNum is cast back to int. This is safe because we already checked for overflow conditions.
 */