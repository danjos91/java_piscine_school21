package com.company;
import java.util.Scanner;

public class Program {

    static int CountNumbersInNumber(int number, int sum){
        if (number > 0) {
            sum =  sum + number % 10;
            sum = CountNumbersInNumber(number / 10,  sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        int number = 0;
        int compareNumber = 2;
        int coffeRequest = 0;
        int sum;

        while (number != 42) {
            number = numberScan.nextInt();
            sum = CountNumbersInNumber(number, 0);

            for(int i = 0; i <= sum/2; i++) {
                if (sum % (i + compareNumber) == 0) {
                    break;
                }
                if (sum / (i + compareNumber) < (i + compareNumber)) {
                    coffeRequest++;
                    break;
                }
            }
        }
        System.out.println("Count of coffee-request - " + coffeRequest);
    }
}