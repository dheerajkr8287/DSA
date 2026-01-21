package HashMap;
import java.util.HashMap;
import java.util.Map;

public class Find_the_highest_lowest_frequency_element {

    /*
    Find the highest/lowest frequency element

Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

Examples
Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.


Example 2:
Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
     */

    //Brute force approch--> O(N)^2

    public static void highAndLowFreqElement(int arr[]){
        int n=arr.length;
        int maxfreq=0,maxElement=0;
        int minFreq=n, minElement=0;
        boolean visted[]=new boolean[n];

        for(int i=0;i<n;i++){

            if (visted[i]) {
                continue;
            }

            int count=1;
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    visted[j]=true;
                    count++;

                }
            }


            if (count>maxfreq) {
                maxElement=arr[i];
                maxfreq=count;


            }

            if (count<minFreq) {
                minElement=arr[i];
                minFreq=count;
            }
        }


        System.out.println("the highest frequency element is :"+maxElement);
        System.out.println("the lowest frequency element is:"+minElement);

    }


    // optimal opproch  O(N)

    public static void  highAndLowFreqElement1(int arr[]){
        int n=arr.length;
        int maxElement=0,maxfreq=0;
        int minElement=0,minFreq=n;

        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int element=entry.getKey();
            int count=entry.getValue();

            if (count>maxfreq) {
                maxElement=element;
                maxfreq=count;

            }

            if (count<minFreq) {
                minElement=element;
                minFreq=count;

            }
        }

        System.out.println("the highest frequency element is :"+maxElement);
        System.out.println("the lowest frequency element is:"+minElement);

    }
    public static void main(String[] args) {
        int arr[]={10,5,10,15,10,5};
        System.out.println("Brute force approch");
        highAndLowFreqElement(arr);
        System.out.println("optimal approch");
        highAndLowFreqElement1(arr);
    }
}

