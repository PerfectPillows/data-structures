package com.company;

public class BinarySearch {
    //Find the middle of the element
    //target element greater than middle search in the right else search in the left
    //

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else return mid;
        }

        return -1;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if(target < letters[0] || target > letters[len - 1]) return letters[0];
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] <= target) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
