package pattern;

import java.util.Scanner;

public class basic {

    public static  void first(int n){
        /*

         ****
         ****
         ****
         ****

         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void second(int n){
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+"");
            }
            System.out.println("");
        }
    }

    public static void  third(int n){
        /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static  void fourth(int n){
        /*
1
2 2
3 3 3
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static  void fifth(int n){
        /*
         * * * *
         * * *
         * *
         *
         */
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static  void sixth(int n){
        /*


1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void  seventh(int n){
        /*

         *
        ***
       *****
      *******
     *********
         */
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void  eight(int n){
        /*
       *********
        *******
         *****
          ***
           *

         */
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void nine(int n){
        /*
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *

         */
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }



    }

    public static void  ten(int n){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
     for(int i=0;i<n;i++){
         for(int j=0;j<=i;j++){
             System.out.print("*"+" ");
         }
         System.out.println();
     }
//        System.out.println("----------------");
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    public static void eleven(int n){
        /*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

         */
        for(int i=0;i<n;i++){
            int start=1;
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    public static void twelve(int n){
        /*
1              1
12            21
123          321
1234        4321
12345      54321
123456    654321
1234567  7654321
1234567887654321
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }

    public static void thirteen(int n) {
        /*
 1   1
1 2  2 1
1 2 3 3 2 1

         */
        // Write your code here.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void fourteen(int n){
        /*
1
23
456
78910
         */
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num+1;

            }
            System.out.println();
        }
    }


    public static void fifteen(int n){
        /*
A
A B
A B C
A B C D
         */
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static  void sixteen(int n){
        /*
A B C D
A B C
A B
A

         */
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+n-i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static  void seventeen(int n){

        for(int i=1;i<=n;i++){
           char ch= (char) ('A'+i-1);

            for(int j=1;j<=i;j++){
               System.out.print(ch);
           }
            System.out.println();
        }
    }






    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        //first(n);
        //second(n);
        //third(n);
        //fourth(n);
        //fifth(n);
        //sixth(n);
        //seventh(n);
        //eight(n);
        //nine(n);
        //ten(n);
        //eleven(n);
       // twelve(n);
        //thirteen(n);
        //fourteen(n);
        //fifteen(n);
       // sixteen(n);
        seventeen(n);

    }
}
