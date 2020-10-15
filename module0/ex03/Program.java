package com.company;
import java.util.Scanner;

public class Program {

    static int CountNumbersInNumber(long number, int count){
        if (number > 0) {
            count = CountNumbersInNumber(number / 10,  count + 1);
        }
        return count;
    }

    static int pow(int number, int pow)
    {
        int numberPow = 1;
        for(int i = 0; i < pow; i++){
            numberPow = numberPow * number;
        }
        return numberPow;
    }

    static void GetNumbersInNumber(long number, int length, int weekNumber){
        long currentMinNumber = number / pow(10, length - 1);
        System.out.print("Week " + weekNumber++ + " ");
        for(int j = 0; j < currentMinNumber; j++) {
            System.out.print("=");
        }
        System.out.println(">");
        if(length > 1){
            GetNumbersInNumber(number % pow(10, length - 1), length - 1, weekNumber);
        }
    }

    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        String line = "";
        String grades = "";
        long gradesLong = 0;
        int currentGrade = 0;
        int weekNumber = 1;
        int length = 0;

        while (!line.equals("42")) {
            int minGrade = 10;
            line = numberScan.nextLine();
            if (!line.equals("42")) {
                grades = numberScan.nextLine();
            }
            if (line.equals("Week " + weekNumber++)){
                for(int i = 0; i <= 8; i = i + 2){
                    currentGrade = grades.charAt(i) - 48;
                    if (currentGrade < minGrade){
                        minGrade = grades.charAt(i) - 48;
                    }
                }
                gradesLong = 10 * gradesLong + minGrade;
            }
           // else
           // {
           //     System.err.println("Illegal Argument");
           //     System.exit(-1);
           // }
        }
        length = CountNumbersInNumber(gradesLong, 0);
        GetNumbersInNumber(gradesLong,length,1);
    }
}
