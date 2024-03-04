package ZhandosSpring.Lesson4;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] nums = {7, -3,	9, -11,	18,	99,	2,	11};
        System.out.println("                     1");
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     2");
        for (int i = 0; i < nums.length / 2; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     3");
        for (int i = nums.length / 2; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     4");
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     5");
        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     6");
        for (int i = 1; i < nums.length; i+=2) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("                     7");
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount++;
            }else negativeCount++;
        }
        System.out.println("Positive numbers count : " + positiveCount);
        System.out.println("Negative numbers count : " + negativeCount);
        System.out.println("                     8");
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[nums.length - 1]);
    }
}
