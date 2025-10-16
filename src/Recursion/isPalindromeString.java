package Recursion;

public class isPalindromeString {
    /**
     * You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.
     *
     * Examples :
     *
     * Input: s = "abba"
     * Output: true
     * Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
     * Input: s = "abc"
     * Output: false
     * Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
     * Constraints:
     * 1 ≤ s.size() ≤ 106
     * The string s contains only lowercase english letters (a-z).
     */

//using loop
    boolean isPalindrome(String s) {
        // code here
        //     StringBuilder s1=new StringBuilder();
        //     for(int i=0;i<s.length();i++){
        //         char temp1=s.charAt(i);
        //         if((temp1>='a' && temp1<='z')){
        //             s1.append(temp1);
        //         }
        //     }



        //     StringBuilder s2=new StringBuilder();
        //     for(int j=s.length()-1;j>=0;j--){
        //         char temp2=s.charAt(j);
        //         if((temp2>='a' && temp2<='z')){
        //             s2.append(temp2);
        //         }
        //     }


        //   if(s1.toString().equals(s2.toString())){
        //             return true;
        //     }
        //         return false;


        //by recursion

        return f(0,s);

    }


    public boolean f(int i,String s){
        int n=s.length();
        if(i>=n/2) return true;

        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }

        return f(i+1,s);
    }
}
