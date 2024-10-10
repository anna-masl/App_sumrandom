package app;

import java.security.SecureRandom;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        Random random = new SecureRandom();
        int number = random.nextInt(11,100_000);
        System.out.println(number);
        int numberforcount = number;
        int count = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num = 0;
        int sum = 0;
        for (;numberforcount != 0; numberforcount /= 10,++count);{
        }
        System.out.println(count);
        switch (count){
            case 5:
                num5 = number%100_000/10_000;
                num4 = number%10_000/1000;
                num3 = number%1000/100;
                num2 = number%100/10;
                num1 = number%10;
                System.out.println("5 " + number);
                System.out.println("5 " + num1);
                System.out.println("5 " + num2);
                System.out.println("5 " + num3);
                System.out.println("5 " + num4);
                System.out.println("5 " + num5);
                break;
            case 4:
                while (number > 0){
                    num = number%10;
                    sum += num;
                    number = number/10;
                }
                System.out.println("4 " + number);
                System.out.println("4 " + sum);
                break;
            case 3:
                System.out.println("3 " + number);
                break;
            case 2:
                System.out.println("2 " + number);
                break;
        }

    }
}
