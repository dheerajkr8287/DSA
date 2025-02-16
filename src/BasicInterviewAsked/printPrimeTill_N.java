package BasicInterviewAsked;

public class printPrimeTill_N {


    //T.C === O(N√N)

    //check prime or not
    static boolean isPrime(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }


        if(count==2){
            return true;
        }else{
            return false;
        }
    }

    // sum till n prime number
    static void  printPrime(int N){
        for (int i = 2; i <=N; i++) {
            if(isPrime(i)){
                System.out.print(i+"  ");
            }

        }

    }
    public static void main(String[] args) {
        printPrime(100);
    }

}
