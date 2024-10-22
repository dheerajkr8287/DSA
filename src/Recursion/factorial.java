package Recursion;

public class factorial {
    static int factbyFunctional(int n){
        // return (n==0)?1:n*fact(n-1);

        //another way
        if(n==0){
            return 1;
        }return n*factbyFunctional(n-1);
    }

    static void factbyParamertical(int i,int fact){
        if(i<1){
            System.out.println(fact);
            return;
        }
        factbyParamertical(i-1, fact*i);
    }




    public static void main(String[] args) {
        int n=3;
        System.out.println(factbyFunctional(n));

        factbyParamertical(n,1);
    }

}







//T.C-->O(N)   &   S.c--->O(N)

