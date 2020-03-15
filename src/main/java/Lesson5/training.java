package Lesson5;

import java.util.Scanner;
public class training {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        String first, second;
        first = scanner.nextLine();
        int convertedFirst = Integer.parseInt(first);
        System.out.print("Please enter the second number: ");
        second = scanner.nextLine();
        int convertedSecond = Integer.parseInt(second);

        int sum = plus(convertedFirst, convertedSecond);
        int sub = minus(convertedFirst, convertedSecond);



        printText(String.format("I added value '%s' to value '%s' and got sum: '%s'",
                convertedFirst, convertedSecond, sum));

        printText(String.format("I subtracted value '%s' and value '%s' and got sum: '%s',",
                convertedFirst, convertedSecond, sub));

    }
        public static int plus(int firstInt, int secondInt) {
            return firstInt + secondInt;
        }
        public static int minus(int firstInt, int secondInt){
            return firstInt - secondInt;
        }

        public static void printText(String text) {
            System.out.println(text);
        }





    }






