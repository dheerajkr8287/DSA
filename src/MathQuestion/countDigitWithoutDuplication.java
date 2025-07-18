package MathQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class countDigitWithoutDuplication {
    static  int countDigit(int n){
        int count=0;
        int N=n;
        HashSet<Integer> SeenSet=new HashSet<>();
        while (n>0){
            int last=n%10;
            n=n/10;
            if(last!=0 && !SeenSet.contains(last)){
                SeenSet.add(last);
                if (N%last==0){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The count of digit "+n+"is:"+countDigit(n));

    }
}
