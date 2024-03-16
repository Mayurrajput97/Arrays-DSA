package com.leetcodeProblems;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, returning an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 10};
        int target = 15;

        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
