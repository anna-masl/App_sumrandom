package app;

import java.security.SecureRandom;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        Random random = new SecureRandom();
        int number = random.nextInt(11, 100_000);
        System.out.println(number);
        int num = 0;
        int sum = 0;

        while (number > 0) {
            num = number % 10;
            sum += num;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

