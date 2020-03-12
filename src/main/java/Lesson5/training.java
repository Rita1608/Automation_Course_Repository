package Lesson5;

import java.util.Scanner;
public class training {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
    String first, second;
    first = scanner.nextLine();
    int convertedFirst = Integer.parseInt(first);
        System.out.print("Please enter the second number: ");
    second = scanner.nextLine();
    int convertedSecond = Integer.parseInt(second);

    String resultAdd;
    resultAdd = plus("Addition of ", convertedFirst, " and ", convertedSecond, " is ", (convertedFirst + convertedSecond));


    String resultSub;
    resultSub = minus("Subtraction of ", convertedFirst, " and ", convertedSecond, " is ", (convertedFirst - convertedSecond));
    printResult(resultAdd, resultSub);




}

    public static String plus(String addition, int convertedFirst, String a, int convertedSecond, String b, int resultAdd) {
        return addition + convertedFirst + a + convertedSecond + b + (convertedFirst + convertedSecond);
    }
    public static String minus(String subtraction, int convertedFirst, String a, int convertedSecond, String b, int resultSub) {
        return subtraction + convertedFirst + a + convertedSecond + b + (convertedFirst - convertedSecond);
    }


    public static void printResult(String resultAdd, String resultSub){
        System.out.println(resultAdd + "\n" + resultSub);

    }


}

