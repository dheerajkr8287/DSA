package loop;

import java.util.Scanner;

public class check_prime {
    static int isPrime(int N) {
        // code here
        if (N == 1) return 0;

        if (N == 2 || N == 3) return 1;

        if (N % 2 == 0 || N % 3 == 0) {
            return 0;
        }

        for (int i = 5; i <= Math.sqrt(N); i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }

        }
            return 1;

    }


    //        most optimal


        /*
        Prime Number

For a given number n check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

Examples :

Input: n = 5
Output: 1
Explanation: 5 has 2 factors 1 and 5 only.
Input: n = 25
Output: 0
Explanation: 25 has 3 factors 1, 5, 25
Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() which takes an integer n as input parameters and returns an integer, 1 if n is a prime number or 0 otherwise.

Expected Time Complexity: O(sqrt(n))
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 109
         */


    class Solution{
        static int isPrime(int N){
            // code here
            int count=0;

            if(N==1){
                return 0;

            }

            for(int i=1;i*i<=N;i++){
                if(N%i==0){
                    count++;
                    if((N%i)!=i){
                        count++;
                    }

                }
            }

            if(count==2){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
/*
//       noob method

        int temp=0;
        if(n==1){
            System.out.println("not prime1");

        }
        for(int i=1;i<=n;i++){
        if(n%i==0){
        temp++;
        }
        }
        if(temp==2){
                    System.out.println("prime1");

        }else{
                    System.out.println("not prime1");

        }
        
        }
        */


//        optimal solution

    /*    (x,y)=n
        (x<=y)
        we TAKE smaller divisor
                x*x<=y
                x<=sqrt(n)


        if(n==1){
            System.out.println("not prime");
        }
        else{
            int temp = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    temp++;
                    break;


                }


            }
            if(temp==0){
                System.out.println("prime");
            }
            else{
                System.out.println("NOT PRIME");
            }

        }*/




    }
}
