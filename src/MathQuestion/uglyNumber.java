package MathQuestion;

public class uglyNumber {
/*
263. Ugly Number
Solved
Easy
Topics
premium lock icon
Companies
An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

Given an integer n, return true if n is an ugly number.



Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.


Constraints:

-231 <= n <= 231 - 1
 */
public boolean isUgly(int n) {
    //brute force -> O(\sqrt{n})
    // if(n<=0) return false;
    // if(n==1)return true;

    // List<Integer> list=List.of(2,3,5);
    // List<Integer> list2=new ArrayList<>();
    // for(int i=2;i*i<=n;i++){
    //     if(n%i==0){
    //         list2.add(i);
    //         while(n%i==0){
    //             n=n/i;
    //         }
    //     }

    // }
    // if(n!=1){
    //         list2.add(n);
    //     }

    // return list.containsAll(list2);



    //optimal code O(log(n))

    if(n<=0) return false;
    int[] fact={2,3,5};
    for(int factor:fact){
        while(n%factor==0){
            n=n/factor;
        }
    }

    if(n==1){
        return true;
    }else{
        return false;
    }




}
}
