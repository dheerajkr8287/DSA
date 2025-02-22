package BasicInterviewAsked;

/*

Given a English alphabet c, Write a program to check whether a character is a vowel or not.



Example 1:

Input:
c = 'a'
Output:
YES
Explanation:
'a' is a vowel.


Example 2:

Input:
c = 'Z'
Output:
NO
Explanation:
'Z' is not a vowel.




Your Task:

You don't need to read input or print anything. Your task is to complete the function isVowel() which takes a character c and returns 'YES' or 'NO'.



Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)



Note: c is either lowercase or uppercase English alphabetic character

Constraints:

c belongs to English Alphabets.
 */

public class Vowel_or_Not {
    String isVowel(char c){
        // code here

        //brute case
        c=Character.toLowerCase(c);
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
            return "YES";
        }else{
            return "NO";
        }


        //alternative case

        // String s=String.valueOf(c).toLowerCase();
        // if("aeiou".contains(s)){
        //     return "YES";
        // }else{
        //     return "NO";
        // }



    }
}
