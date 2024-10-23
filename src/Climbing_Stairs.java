public class Climbing_Stairs {
    /*
    70. Climbing Stairs
Solved
Easy
Topics
Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45
     */

    class Solution {
        int arr[] = new int[46];

        public int climbStairs(int n) {
//WITH USING MEMOZIATIONS
//T.C--O(N)
            if (n == 1) return 1;
            if (n == 2) return 2;
            if (arr[n] != 0) return arr[n];
            arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
            return arr[n];


            //using recusion
            //Time Complexity: O(2^n) because the function makes two recursive    calls for each call, leading to exponential time.
            //Space Complexity:Space Complexity: O(n) due to the recursion stack.

            // if(n==1)return 1;
            // if(n==2) return 2;
            // return climbStairs(n-1)+climbStairs(n-2);


            //using loop ---optimal solutions
            //t.c----O(n)
            //s.c--O(1)
            // if(n<=2)return n;
            // int a=1,b=2;
            // int result=0;
            // for(int i=3;i<=n;i++){
            //     result=a+b;
            //     a=b;
            //     b=result;
            // }
            // return result;
        }
    }
}