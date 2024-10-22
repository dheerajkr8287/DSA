package loop;

import java.util.ArrayList;

public class Findall_factorial_numbersless_than_or_equal_to_n {
    /*
    A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Examples:

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.
Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
Expected Time Complexity: O(k), Where k is the number of factorial numbers.
Expected Auxiliary Space: O(1)

Constraints:
1<=n<=1018
     */
    class Solution {
        static ArrayList<Long> factorialNumbers(long n) {

            // code here
            ArrayList<Long>list=new ArrayList<>();
            long fact=1;int i=1;
            if(n==0){
                // list.add(1L);

                return list;
            }




            while(fact<=n){
                fact*=i;
                if(fact<=n){
                    list.add(fact);
                }
                i++;
            }
            return list;

        }

    }


}
