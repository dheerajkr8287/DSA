public class validPalindrome {
    /*
    125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

     */

    class Solution {

        public boolean isPalindrome(String s) {
            // int l=0;
            // int r=s.length()-1;
            // while(l<r){
            //     char temp=s.charAt(l);
            //     if((l<r)&&!((temp>=65&&temp<=90) || (temp >= 97 && temp <= 122)  || (temp>=48 && temp<=57))){
            //         l++;
            //         continue;
            //     }
            //     char temp2=s.charAt(r);
            //     if((l<r)&&!((temp2>=65&&temp2<=90) || (temp2 >= 97 && temp2 <= 122)  || (temp2>=48 && temp2<=57))){
            //         r--;
            //          continue;
            //     }


            //     if(Character.toLowerCase(temp)!=Character.toLowerCase(temp2))return false;
            //     l++;
            //     r--;

            // }

            // return true;




            //Solution string Bulider


            StringBuilder st=new StringBuilder();


            for(int i=0;i<s.length();i++){
                char temp=s.charAt(i);
                if((temp>=65&&temp<=90) || (temp >= 97 && temp <= 122)  || (temp>=48 && temp<=57)){
                    st.append(Character.toLowerCase(temp));
                }

            }


            StringBuilder st2=new StringBuilder();
            for(int j=s.length()-1;j>=0;j--){
                char temp2=s.charAt(j);
                if((temp2>=65&&temp2<=90) || (temp2 >= 97 && temp2 <= 122)  || (temp2>=48 && temp2<=57)){
                    st2.append(Character.toLowerCase(temp2));
                }

            }



            if(st.toString().equals(st2.toString())){
                return true;
            }
            return false;



        }
    }
}
