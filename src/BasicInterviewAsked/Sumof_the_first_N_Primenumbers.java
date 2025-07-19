package BasicInterviewAsked;

public class Sumof_the_first_N_Primenumbers {

    /*
    Sum of all prime numbers between 1 and n
Difficulty: EasyAccuracy: 18.71%Submissions: 62K+Points: 2Average Time: 15m
Given a positive integer n, compute and return the sum of all prime numbers between 1 and n (inclusive).

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

Examples:

Input: n = 5
Output: 10
Explanation: 2, 3 and 5 are prime numbers between 1 and 5(inclusive), and their sum is 2 + 3 + 5 = 10.
Input: n = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime numbers between 1 and 10(inclusive), and their sum is 2 + 3 + 5 + 7 = 17.
Constraints:
1 <= n <= 105


     */

    public int prime_Sum(int n) {
        // code here

        long sum=0;

        for(int i=1;i<=n;i++){
            int count=0;
            if(i<=1)continue;

            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    if((i/j)!=j){
                        count++;

                    }
                }
            }
            if(count==2){
                sum=sum+i;
            }
        }

        return (int)sum;

    }





    //ANOTHER WAY TO SOLVE THIS

    static int sum=0;

    //T.C === O(N√N)

    //check prime or not
    static boolean isPrime(int n) {
        int count=0;
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

    // sum till n prime number
    static int printPrime(int N){
        for (int i = 2; i <=N; i++) {
            if(isPrime(i)){
                sum=sum+i;
            }

        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(printPrime(100));
    }

}
