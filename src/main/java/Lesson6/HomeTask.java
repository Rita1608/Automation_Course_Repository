package Lesson6;


public class HomeTask {

    public static void main(String[] args) {

        reading();
        relaxing();
        cooking();

        totalTimeSpent = 0;
        totalTimeSpent1 = 60;
        totalTimeSpent2 = 120;
        totalTimeSpent3 = 30;

        int result = totalTimeSpent3();

        System.out.println(String.format("Total time spent on all activities in minutes: %s", result));


    }

    public static void reading() {
        printText("I was reading for 60 minutes");
        totalTimeSpent1();

    }

    public static void relaxing() {
        printText("I was relaxing for 120 minutes");
        totalTimeSpent2();


    }

    public static void cooking() {
        printText("I was cooking for 30 minutes");
        totalTimeSpent3();

    }

    public static void printText(String text) {
        System.out.println(text);


    }

    public static int totalTimeSpent = 0;
    public static int totalTimeSpent1 = 60;
    public static int totalTimeSpent2 = 120;
    public static int totalTimeSpent3 = 30;

    public static void totalTimeSpent1() {
       int sum = totalTimeSpent + totalTimeSpent1;

    }

    public static void totalTimeSpent2() {
        int sum = totalTimeSpent + totalTimeSpent1 + totalTimeSpent2;

    }

    public static int totalTimeSpent3() {

        return totalTimeSpent + totalTimeSpent1 + totalTimeSpent2 + totalTimeSpent3;
    }
}


// public static void main(String[] args) {
//
//    int time1 = reading();
//    int time2 = relaxing();
//    int time3 = cooking();
//
//
//
//
//
//    int result = totalTimeSpent(time1,  time2,  time3);
//
//        System.out.println(String.format("Total time spent on all activities in minutes: %s", result));
//
//
//                }
//
//public static int reading() {
//        printText("I was reading for 60 minutes");
//        int time1 = 60;
//        return time1;
//        }
//
//public static int relaxing() {
//        printText("I was relaxing for 120 minutes");
//        int time2 = 120;
//        return time2;
//
//        }
//
//public static int cooking() {
//        printText("I was cooking for 30 minutes");
//        int time3 = 30;
//        return time3;
//
//        }
//public static void printText(String text) {
//        System.out.println(text);
//
//
//        }
//
//
//
//public static int totalTimeSpent(int time1, int time2, int time3){
//        int sum;
//        sum = time1 + time2 + time3;
//        return sum;






