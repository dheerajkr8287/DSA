package BasicInterviewAsked;

public class LeapYear {
    static boolean isLeap(int N) {
        // code here

        if((N%4==0)&&(N%100!=0)||(N%400==0)){

            return true;
        }else{
            return false;
        }

    }

}
