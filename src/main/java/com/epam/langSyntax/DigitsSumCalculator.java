package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int num = number;
        int sum = 0;

        while (num != 0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
