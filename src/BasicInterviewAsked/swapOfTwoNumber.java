package BasicInterviewAsked;

import java.util.ArrayList;
import java.util.List;

/*
You are given two numbers a and b. Your task is to swap the given two numbers.

Note: Try to do it without a temporary variable.

Examples:

Input: a = 13, b = 9
Output: 9 13
Explanation: After swapping it becomes 9 and 13.
Input: a = 15, b = 8
Output: 8 15
Explanation: after swapping it becomes 8 and 15.
Constraints:
1 ≤ a, b ≤ 106
 */
public class swapOfTwoNumber {
    static List<Integer> get(int a,int b)
    {
        // code here
        List<Integer> list=new ArrayList<>();
        //using without third variable
        a=a+b;
        b=a-b;
        a=a-b;

        //using third variable
        // int c=a;
        // a=b;
        // b=c;




        list.add(a);
        list.add(b);






        return list;
    }
}
