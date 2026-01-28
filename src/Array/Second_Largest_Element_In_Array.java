package Array;

public class Second_Largest_Element_In_Array {
    /*
    Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
     */


    public int getSecondLargest(int[] arr) {
        // code here
        //using bubble sort --brute force O(N)^2  because of sorting take more time
        // int n=arr.length;

        // for(int i=n-1;i>=0;i--){
        //     int didSwap=0;
        //     for(int j=0;j<=i-1;j++){
        //         if (arr[j]>arr[j+1]) {
        //             int tem=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=tem;
        //             didSwap=1;
        //         }
        //     }

        //     if (didSwap==0) {
        //         break;
        //     }
        // }

        // int largest=arr[n-1];
        // int second=-1;
        // for(int k=n-2;k>=0;k--){
        //     if (arr[k]!=largest) {
        //         second=arr[k];
        //         break;
        //     }
        // }
        // return second;





        //better solution t.c-> O(n)+O(n)->O(2n)

        //  int n=arr.length;
        // int largest=arr[0];
        // for(int i=0;i<n;i++){
        //     if(arr[i]>largest){
        //         largest=arr[i];
        //     }
        // }

        // int secondlargest=-1;
        // for(int i=0;i<n;i++){
        //     if (arr[i]>secondlargest && arr[i]!=largest) {
        //         secondlargest=arr[i];
        //     }
        // }

        // return secondlargest;




        //optimal solution  t.c-->O(N)
        int n=arr.length;
        int largest=arr[0];
        int sLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];

            }
        }

        return sLargest;
    }
}
