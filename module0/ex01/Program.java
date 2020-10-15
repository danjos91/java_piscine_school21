package com.company;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        int compareNumber = 2;

        if (number <= 0 || number == 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        for(int i = 0; i <= number/2; i++) {
            if (number % (i + compareNumber) == 0) {
                System.out.print("false ");
                System.out.println(i + 1);
                return;
            }
            if (number / (i + compareNumber) < (i + compareNumber)) {
                System.out.print("true ");
                System.out.println(i + 1);
                return;
            }
        }
    }
}