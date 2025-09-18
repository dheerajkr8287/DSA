package MathQuestion;

import java.util.stream.IntStream;

public class Count_the_Digits_That_Divide_a_Number {

//    leetcode 2520:Count the Digits That Divide a Number

/*
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.



Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


Constraints:

1 <= num <= 109
num does not contain 0 as one of its digits.
 */


    //solutions
    public int countDigits(int num) {
        // int count=0;
        // int n=num;
        // while(num>0){
        //     int last=num%10;
        //     if(last!=0 && n%last==0){
        //         count++;
        //     }
        //     num=num/10;
        // }
        // return count;



        //using java 8

        int n=num;
        int length=(int) Math.log10(num)+1;
        /**
         n = 1012
         length = (int) Math.log10(1012) + 1 = 3.00... + 1 = 4        → The number has 4 digits

         Iteration 1 → i = 0
         Extract digit: (1012 / 10^0) % 10 = (1012 / 1) % 10 = 1012 % 10 = 2
         Check: 2 != 0 && 1012 % 2 == 0 →  true
         Keep digit 2.

         goes till i
         */

        return (int) IntStream.range(0,length)
                .map(i->(int)(num/(int)Math.pow(10,i)%10)) // extract digit at position i
                .filter(l->l!=0 && n%l==0)                 // check divisibility
                .count();








    }
}
