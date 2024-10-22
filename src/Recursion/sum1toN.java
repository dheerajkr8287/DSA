package Recursion;

public class sum1toN {
    static void f(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);
    }

    static int sum(int n){
        // if(n==0){
        //     return 0;
        // }
        // return n+sum(n-1);



        //better ways
        return(n==0) ?0 :n+sum(n-1);
    }

    static long sumOfSeries(long n) {
        // code here
        return  (n<1) ?0:(long)Math.pow(n,3)+sumOfSeries(n-1);



    }

    public static void main(String[] args) {
        int n=18468;
        System.out.println("By using paramertical");
        f(n,0);
        System.out.println("by using Functional");
        System.out.println(sum(n));

        System.out.println(sumOfSeries(n));

    }

}




/*
  The StackOverflowError is happening because your recursive method is repeatedly calling itself without terminating, especially for large values of n. Recursive methods can cause stack overflow when they are too deep, which is likely the case with large inputs like 18468.
 */


