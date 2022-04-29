package main.com.griddynamics;

import java.util.Arrays;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int[] rotate = new int[k];
        int y = k;//   7              4
        for (int j = k - 1, i = 0; j >= 0; j--, i++) {
            rotate[j] = nums[nums.length - 1 - i];
        }
        System.out.println("Arrays.toString(rotate) = " + Arrays.toString(rotate));

        for (int z = nums.length - 1; z-k >= 0; z--) {
            nums[z] = nums[z - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i]=rotate[i];
        }

    }

    public void rotate2(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j, last;
            last = nums[nums.length - 1];

            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}
