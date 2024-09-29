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


//        most optimal



    }
}
