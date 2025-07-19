package MathQuestion;

public class Sum_of_primes {
    /*
    Sum of primes
Difficulty: BasicAccuracy: 37.14%Submissions: 23K+Points: 1
You are given an integer n. Your task is to calculate the sum of primes present as digits of a given number n.

Examples:

Input: n = 333
Output: 9
Explaination: 3 is a prime number. It is present 3 times. So 3+3+3 = 9.
Input: n = 686
Output: 0
Explaination: Neither 6 nor 8 is a prime number.
Constraints:
1 ≤ n ≤ 5*104

     */


    static int primeSum(int n) {
        // code here
        int sum=0;


        while(n>0){
            int last=n%10;
            n=n/10;

            if(last<=1) continue;

            int count=0;
            for(int i=1;i*i<=last;i++){
                if(last%i==0){
                    count++;
                    if((last/i)!=i){
                        count++;
                    }
                }
            }

            if(count==2){
                sum=sum+last;

            }

        }

        return sum;



    }
}
