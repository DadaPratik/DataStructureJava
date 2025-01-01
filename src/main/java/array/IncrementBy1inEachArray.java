package array;

import java.util.Arrays;

public class IncrementBy1inEachArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        System.out.println("Adding 1 in each array: ");

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + 1;
        }

        System.out.println(Arrays.toString(result));


    }
}
