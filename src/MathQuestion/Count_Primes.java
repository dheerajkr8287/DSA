package MathQuestion;

public class Count_Primes {
    /*
    204. Count Primes
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer n, return the number of prime numbers that are strictly less than n.



Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0


Constraints:

0 <= n <= 5 * 106
     */


    //brute force
    public int countPrimes(int n) {
        int count=0,prime=0;
        if(n==0 || n==1){
            return 0;
        }

        // for(int i=2;i<n;i++){
        //     if(isPrime(i)){
        //         prime++;
        //     }

        // }

        int i = 2;
        while (i < n) {
            if(isPrime(i)){
                prime++;
            }
            i++;
        }


        return prime;

    }


    boolean isPrime(int n){
        int count=0;
        if(n<=1)return false;
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
