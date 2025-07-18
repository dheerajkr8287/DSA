package BasicInterviewAsked.input_Output;

import java.util.Scanner;

public class print_AsciiValue_of_character {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int Ascii=(int)ch;
        System.out.println("Ascii value of "+ch+" is:"+Ascii);

    }
}
