package BasicInterviewAsked;

/*
Given a number n, determine whether it is a prime number or not. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
Constraints:
1 ≤ n ≤ 109
 */

public class check_prime {
    static boolean isPrime(int n) {

        // brute force method

        int count=0;
        // if(n==0 || n==1){
        //     return false;
        // }

        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;

        //     }
        // }

        // if(count==2){
        //     return true;
        // }else{
        //     return false;
        // }



        //alternative method

        /*
        n = 7
        count = 0
        Start the loop with i = 1, and it runs while i * i <= 7 (i.e., i <= sqrt(7) ≈ 2.64, so i runs from 1 to 2).
        */

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;

                if((n/i)!=i){
                    count++;
                }
            }
        }


        if(count==2){
            return true;
        }else{
            return false;
        }








    }
}
