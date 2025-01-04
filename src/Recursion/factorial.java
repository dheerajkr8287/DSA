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

/*
Factorials Less than or Equal to n
Difficulty: EasyAccuracy: 48.96%Submissions: 106K+Points: 2
A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Examples:

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.
Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
Constraints:
1<=n<=1018
 */

//   ---------------solution--------------

//class Solution {
//    static ArrayList<Long> factorialNumbers(long n) {
//        // by using the counter varicble i
//        // long fact=1;
//        // int i=1;
//        // ArrayList<Long> ls=new ArrayList<>();
//        // if(n==0){
//        //   return ls;
//        // }
//
//        // while(fact<=n){
//        //     ls.add(fact);
//        //     i++;
//        //     fact=fact*i;
//        // }
//
//        // return ls;
//
//
//
//
//
//
//        //by using recursive call
//        ArrayList<Long> ls=new ArrayList<>();
//        generateFactorial(1,1,n,ls);
//        return ls;
//
//
//
//
//
//    }
//
//    //hepler function
//    static void generateFactorial(long i, long fact, long n, ArrayList<Long> ls) {
//        // Base case: Stop if the current factorial exceeds n
//        if (fact > n) {
//            return;
//        }
//        // Add the current factorial to the list
//        ls.add(fact);
//        // Recursive call for the next factorial
//        generateFactorial(i + 1, fact *(i+1), n, ls);
//    }
//}