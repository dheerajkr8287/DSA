package Recursion;

public class Sum_of_first_n_terms {
    /*
    Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Examples:

Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
Input: n = 7
Output: 784
Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784
Constraints:
1 <= n <= 200
     */

    class Solution {
        int sumOfSeries(int n) {

            //by using the loop

            // double sum=0;
            // for(int i=1;i<=n;i++){
            //     sum=sum+Math.pow(i,3);
            // }
            // return (int)sum;


            //by using   parametic recursion
            // double sum;
            //  return sumHelper(n,0);



            //by using recursion

            if(n==0){
                return 0;
            }else{
                return (int)Math.pow(n,3)+sumOfSeries(n-1);
            }

        }





        // int sumHelper(int i, double sum){
        //     if(i<1){
        //         return (int)sum ;
        //     }else{
        //       return  sumHelper(i-1,sum+Math.pow(i,3));

        //     }




        // }
    }

}
