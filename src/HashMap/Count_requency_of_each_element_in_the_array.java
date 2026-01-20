package HashMap;



import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

public class Count_requency_of_each_element_in_the_array {
    /*
    Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

Examples
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	            5  2
                15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2:
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	           3  1
               4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array


    */

    //with a Brute force -> O(N)^2
    public static void countFreq(int arr[]){
        int n=arr.length;
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
            System.out.println(arr[i]+":"+count);
        }




    }


    //with a optimal -> O(N)

    public static void frequency(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }


        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        countFreq(arr);
        System.out.println("optimal");
        frequency(arr);


    }

}

