package Recursion;

public class Reverse_an_Array {
    /*
    Reverse an Array
Difficulty: EasyAccuracy: 55.32%Submissions: 29K+Points: 2
You are given an array of integers arr . Your task is to reverse the given array and return the reversed array.

Examples:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1<=arr.size()<=105
0<=arr[i]<=105
     */


        int i=0;
        public void reverseArray(int arr[]) {
            // code here

            //by loop
            // int l=0;
            // int r=arr.length-1;
            // while(l<r){
            //     int tem=arr[l];
            //     arr[l]=arr[r];
            //     arr[r]=tem;

            //     l++;
            //     r--;
            // }


            //recursive approch
            int n=arr.length;
            if(i==n/2){
                return ;
            }
            int swap=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=swap;
            i++;
            reverseArray( arr);

            //BY COLLECTION
            // List<Integer> list=new ArrayList<>();
            // for(int num:arr){
            //     list.add(num);
            // }
            // Collections.reverse(list);
            // for(int i=0;i<arr.length;i++){
            //     arr[i]=list.get(i);
            // }


            //RECURSION
            // int n=arr.length-1;
            // f(0,n,arr);

        }

//BY USING RECURSION
    // public void f(int l,int r,int arr[]){
    //     if(l>=r)return;

    //     int tem=arr[l];
    //     arr[l]=arr[r];
    //     arr[r]=tem;

    //     f(l+1,r-1,arr);

    // }





}
