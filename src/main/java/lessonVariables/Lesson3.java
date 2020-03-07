package lessonVariables;

import java.util.Scanner;

public class Lesson3 {
    public static <integer> void main(String[] args) {

        //INTEGER TYPE ONLY
        //Scanner scanner = new Scanner(System.in);
        //Integer first, second, resultAdd, resultSub;
        //System.out.print("Please enter the first number: ");
        //first = scanner.nextInt();
        //System.out.print("Please enter the second number: ");
        //second = scanner.nextInt();
        //resultAdd = first + second;
        //System.out.println("Addition result is " + resultAdd);
        //resultSub = first - second;
        //System.out.println("Subtraction result " + resultSub);



        //STRING.VALUEOF METHOD
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Please enter the first number: ");
        //Integer firstNumber;
        //firstNumber = scanner.nextInt();
        //System.out.print("Please enter the second number: ");
        //Integer secondNumber;
        //secondNumber  = scanner.nextInt();

        //String resultAddition;
        //resultAddition = String.valueOf(firstNumber + secondNumber);
        //System.out.println("Addition result is " + resultAddition);

        //String resultSubtraction;
        //resultSubtraction = String.valueOf((firstNumber - secondNumber));
        //System.out.println("Subtraction result is " + resultSubtraction);


        //INTEGER.PARSEINT METHOD
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        String first, second;
        first = scanner.nextLine();
        int convertedFirst = Integer.parseInt(first);
        System.out.print("Please enter the second number: ");
        second = scanner.nextLine();
        int convertedSecond = Integer.parseInt(second);

        int resultAdd, resultSub;
        resultAdd = convertedFirst + convertedSecond;
        resultSub = convertedFirst - convertedSecond;
        System.out.println("Addition result is " + resultAdd);
        System.out.println("Subtraction result is " + resultSub);








    }
}
