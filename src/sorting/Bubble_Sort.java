package sorting;

public class Bubble_Sort {
    /*
    Given an array, arr[]. Sort the array using bubble sort algorithm.

Examples :

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: After Sorting the array in ascending order of their values is [1, 3, 4, 7, 9].
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: Sort the array in ascending order of their values.
Input: arr[] = [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
Explanation: An array that is already sorted should remain unchanged after applying bubble sort.
Constraints:
1 ≤ arr.size() ≤ 103
1 ≤ arr[i] ≤ 103
     */

    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }
            }

            if(didSwap==0){
                break;
            }
        }
    }
}

//t.c-->  for worst,average==> O(N)^2
//   best=> o(N)