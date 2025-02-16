package BasicInterviewAsked;

public class Sumof_the_first_N_Primenumbers {
    static int sum=0;

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
    static int printPrime(int N){
        for (int i = 2; i <=N; i++) {
            if(isPrime(i)){
                sum=sum+i;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printPrime(100));
    }

}
