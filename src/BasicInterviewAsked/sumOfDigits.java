package BasicInterviewAsked;


/*
Given a number n. Find the sum of all the digits of n.

Examples:

Input: n = 12
Output: 3
Explanation: Sum of 12's digits: 1 + 2 = 3
Input: n = 23
Output 5
Explanation: Sum of 23's digits: 2 + 3 = 5
Constraints:
1<= n <=10
 */
public class sumOfDigits {


    // static int sumOfDigits(int n) {
    //     // code here
    //     int sum=0;
    //     while(n>0){
    //         int lastdigit=n%10;
    //         sum=sum+lastdigit;
    //         n=n/10;
    //     }
    //     return sum;


    //Time Complexity: O(log n)



    // }







    //aternative way recursive
    static int sumOfDigits(int n) {
        // code here
        if(n==0){
            return 0;
        }

        return (n%10) + sumOfDigits( n/10);

        //Time Complexity: O(log n)






    }
}
