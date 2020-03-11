package Lesson5;

import java.util.Scanner;

public class MyHometask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        String first, second;
        first = scanner.nextLine();
        int convertedFirst = Integer.parseInt(first);
        System.out.print("Please enter the second number: ");
        second = scanner.nextLine();
        int convertedSecond = Integer.parseInt(second);

        int resultPlus = plus(convertedFirst, convertedSecond);

        int resultMinus = minus(convertedFirst, convertedSecond);

        resultPrint("Addition Result is ", resultPlus);
        resultPrint("Addition Result is ", resultMinus);


    }

    public static int plus(int convertedFirst, int convertedSecond) {
        return convertedFirst + convertedSecond;
    }

    public static int minus(int convertedFirst, int convertedSecond) {
        return convertedFirst - convertedSecond;
    }


    public static void resultPrint(String textAdd, int result) {
        System.out.println(textAdd + result);

    }
}



