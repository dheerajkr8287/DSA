package MathQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Self_Dividing_Numbers {
    /**
     * 728. Self Dividing Numbers
     * Solved
     * Easy
     * Topics
     * premium lock icon
     * Companies
     * Hint
     * A self-dividing number is a number that is divisible by every digit it contains.
     *
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * A self-dividing number is not allowed to contain the digit zero.
     *
     * Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).
     *
     *
     *
     * Example 1:
     *
     * Input: left = 1, right = 22
     * Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
     * Example 2:
     *
     * Input: left = 47, right = 85
     * Output: [48,55,66,77]
     *
     *
     * Constraints:
     *
     * 1 <= left <= right <= 104
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        //     for(int n=left;n<=right;n++){
        //         if(isSelfDividing(n)){
        //             list.add(n);
        //         }
        //     }
        //   return list;


        //by streams using java 8
        return IntStream.rangeClosed(left,right)
                .filter(Self_Dividing_Numbers::isSelfDividing)
                .boxed()
                .collect(Collectors.toList());

    }


    public static boolean isSelfDividing(int n){
        int temp=n;
        while(temp>0){
            int last=temp%10;
            if(last==0 || n%last!=0){
                return false;
            }
            temp=temp/10;


        }
        return true;


    }


}

/**
 Time Complexity

 Iterating from left to right = O(N) numbers.

 Checking digits = O(d) per number.

 Total = O(N × d).

 👉 Since d is very small (≤ 5 for n ≤ 10000), this is practically O(N).
 */
