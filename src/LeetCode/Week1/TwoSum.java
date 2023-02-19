package LeetCode.Week1;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int array[] = {2,7,11,15};
//        int array[] = {3,3};
        int target = 9;
        System.out.println(Arrays.toString(Solution.solution(array, target)));
    }
}


class Solution{
    public static int[] solution(int[] array, int target){
        int[] a = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    continue;
                }
                else if(array[i] + array[j] == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}
