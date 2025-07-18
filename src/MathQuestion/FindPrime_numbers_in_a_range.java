package MathQuestion;

import java.util.ArrayList;

public class FindPrime_numbers_in_a_range {
    /*

Find Prime numbers in a range
Difficulty: Medium  Accuracy: 48.64%Submissions: 53K+Points: 4Average Time: 10m
Given two integers M and N, generate all primes between M and N including M and N.

Example 1:

Input:
M=1,N=10
Output:
2 3 5 7
Explanation:
The prime numbers between 1 and 10
are 2,3,5 and 7.
Example 2:

Input:
M=2, N=5
Output:
2,3,5
Explanation:
The prime numbers between 2 and 5 are
2,3 and 5.

Your Task:
You don't need to read input or print anything. Your task is to complete the function primeRange() which takes 2 integer inputs M and N and returns a list of all primes between M and N including N and M.


Expected Time Complexity:O(N*sqrt(N))
Expected Auxillary Space:O(1)


Constraints:
1<=M<=N<=106


     */

//BRUTE FORCE

//    ArrayList<Integer> primeRange(int M, int N) {
//         ArrayList<Integer> list=new ArrayList<>();
//
//         for(int i=M;i<=N;i++){
//             int count=0;
//             if(i<=1) continue ;
//             for(int j=1;j*j<=i;j++){
//                 if(i%j==0){
//                     count++;
//                     if((i/j)!=j){
//                         count++;
//                     }
//                 }
//             }
//
//             if(count==2){
//                 list.add(i);
//             }
//
//
//
//         }
//
//         return list;
//
//     }



//    OPTIMIZE code
ArrayList<Integer> primeRange(int M, int N) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=M;i<=N;i++){
        if(i<2)continue;
        if(i==2 || i==3){
            list.add(i);
            continue;
        }

        if(i%2==0)continue;

        boolean isPrime=true;
        for(int j=3;j*j<=i;j+=2){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime) list.add(i);

    }

    return list;
}


}
