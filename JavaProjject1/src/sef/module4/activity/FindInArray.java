package sef.module4.activity;

public class FindInArray {

    public static void main(String[] args) {

        int[] nums = {10, 20, 50, 35};

        int result = nums[0];

        //Loop through the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        System.out.println("Largest in array is " + result);
    }
}
