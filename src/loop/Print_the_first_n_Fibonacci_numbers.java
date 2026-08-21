package loop;

import java.util.Scanner;

public class Print_the_first_n_Fibonacci_numbers {
    static void Fibonacci(int n){

        int n1=0,n2=1,n3=0;
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scanner.nextInt();
        Fibonacci(n);
    }
}
