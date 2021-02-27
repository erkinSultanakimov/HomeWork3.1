package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        double[] numbers = new double[8];
        numbers[0] = 1.1;
        numbers[1] = 1.2;
        numbers[2] = 1.3;
        numbers[3] = 1.4;
        numbers[4] = -1.4;
        numbers[5] = -1.5;
        numbers[6] = -1.6;
        numbers[7] = -1.7;

        int[] nums = {8, -2, -4, 2, 3, 6};
        double sum;
        double avg;
        int count = nums.length;
        sum = 0;
        int nul = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isNegative = false;
            if (nums[i] < 0) {
                isNegative = true;

            }
            if (isNegative) {
                nums[i] = 0;
                count --;
            }
            nums[0] = 0;
            sum = sum + nums[i];
        }

        System.out.println(sum);
        count = count - 1;
        System.out.println(count);
        avg = sum / count;
        System.out.println(avg);


    }
}

