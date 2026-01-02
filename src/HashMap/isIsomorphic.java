package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class isIsomorphic {
/*
205. Isomorphic Strings
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true



Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */


    //FIRST SOLUTION USING HASHMAP AND HASHSET (T.C-> O(N)
//    public boolean isIsomorphic(String s, String t) {
//
//        HashMap<Character,Character> mp=new HashMap<>();
//        HashSet<Character> set=new HashSet<>();
//        for(int i=0;i<s.length();i++){
//            Character sch=s.charAt(i);
//            Character tch=t.charAt(i);
//
//            if(mp.containsKey(sch)){
//                if(mp.get(sch)!=tch) return false;
//            }else if(set.contains(tch)) {
//                return false;
//            }
//
//            else{
//                mp.put(sch,tch);
//                set.add(tch);
//            }
//        }
//
//        return true;
//
//
//
//
//    }



         //SECOND SOLUTION USING ONLY HASHMAP       T.C-> O(N)^2
         public boolean isIsomorphic(String s, String t) {
             HashMap<Character,Character> mp=new HashMap<>();
             for(int i=0;i<s.length();i++){
                 Character sch=s.charAt(i);
                 Character tch=t.charAt(i);

                 if(mp.containsKey(sch)){
                     if(mp.get(sch)!=tch) return false;
                 }else if(mp.containsValue(tch)) {
                     return false;
                 }

                 else{
                     mp.put(sch,tch);
                 }
             }

             return true;


         }
}
