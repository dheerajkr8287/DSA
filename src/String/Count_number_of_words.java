package String;

public class Count_number_of_words {
    /*
    Given a string consisting of spaces,\t,\n and lower case  alphabets.Your task is to count the number of words where spaces,\t and \n work as separators.


Example 1:

Input: S = "abc def"
Output: 2
Explanation: There is a space at 4th
position which works as a seperator
between "abc" and "def"


Example 2:

Input: S = "a\nyo\n"
Output: 2
Explanation: There are two words "a"
and "yo" which are seperated by "\n".

Your Task:
You don't need to read input or print anything. Your task is to complete the function countWords() which accepts a string as input and returns number of words present in it.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
where N is length of given String.

Constraints:
2 <= Length of String <= 106
     */

    int countWords(String s) {
        // code here
        // Convert visible escape sequences like \n or \t into actual newlines or tabs
        s = s.replace("\\n", "\n");
        s = s.replace("\\t", "\t");
        boolean inWord=false;

        int count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c!=' ' && c!='\t' && c!='\n'){
                if(!inWord){
                    count++;
                    inWord=true;
                }
            }else{
                inWord=false;
            }
        }

        return count;
    }
}


/*
What this means:
Before	After
"a\\nb"	"a\nb" (actual newline)
"a\\tb"	"a\tb" (actual tab)
 */