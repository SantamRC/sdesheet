import java.util.*;
import java.io.*;

public class Solution {
    public static void sort(int[] arr) {
        // Write your code here
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    ++low;
                    ++mid;
                    break;
                }
                case 1: {
                    ++mid;
                    break;
                }
                case 2: {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    --high;
                    break;
                }
            }
        }
    }

}

public static void main(String[] args){
    Solution sol=new Solution();
    sol.sort([1,0,0,2,2,1,1,0,0,2]);
}