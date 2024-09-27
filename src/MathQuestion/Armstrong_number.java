package MathQuestion;

public class Armstrong_number {
    /*
    Armstrong Numbers
Difficulty: EasyAccuracy: 49.88%Submissions: 155K+Points: 2
You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371.

Note: Return "true" if it is an Armstrong number else return "false".

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. Hence answer is "false".
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 ≤ n <1000
     */


    class Solution {
        static String armstrongNumber(int n) {
            // code here

            int sum=0;
            int dp=n;
            while(n>0){
                int last=n%10;
                sum=sum+(int) Math.pow(last, 3);
                n=n/10;

            }

            if(sum==dp){
                return "true";
            }
            else{
                return "false";
            }

        }
    }

}

/*

In Java, the Math.pow() method returns a double value, which is a floating-point number. However, the variable sum is an int, which is a whole number.
Java does not automatically convert a double to an int because it could result in a loss of precision (i.e., fractional parts would be discarded).
This kind of conversion is known as a narrowing conversion,
and it requires explicit action from the programmer to ensure you're aware of the potential data loss.
 */