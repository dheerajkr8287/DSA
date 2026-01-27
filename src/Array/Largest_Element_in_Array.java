package Array;

public class Largest_Element_in_Array {

    /*
    Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr[] = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr[] = [10]
Output: 10
Explanation: There is only one element which is the largest.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 106


     */
    public static int largest(int[] arr) {
        // code here


        // brute force using selection sort O(N)^2   --: this not recommonded
        // int n=arr.length;
        // for(int i=0;i<=n-2;i++){
        //     int min=i;
        //     for(int j=i;j<=n-1;j++){
        //         if(arr[j]<arr[min]){
        //             min=j;
        //         }
        //     }

        //     int temp=arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }

        // return arr[n-1];






        //Optimal solution  T.C -> O(n)   S.C=> o(1)

        int n=arr.length;
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
