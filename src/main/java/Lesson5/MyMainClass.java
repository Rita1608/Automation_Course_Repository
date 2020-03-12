package Lesson5;

public class MyMainClass<symbol> {
    public static void main(String[] args){
    //public static void main(String[] args) {
        //String myName = "My name is Rita";
        //printBeautifully(myName, '$');

        //}

        //public static void printBeautifully(String smthToDisplay, char symbol){
        //System.out.println(symbol + "     " + symbol);
        // System.out.println(smthToDisplay);
        //System.out.println(symbol + "    " + symbol);
        //}
//}

        //String catName = "Vasya";
        //String dogName = "Zhuchka";
        //displayAnimals(catName);

        //public static void methodB(displayAnimals, String space) {
        //System.out.println(displayAnimals);
        //System.out.println(space);
        //}

        //String myString = combinedString(String a, String b, char c);
       // printMystring(String myString);



        String myString;
        myString = combinedString("Belka", "Luche Strelki", '-');
        printMyString(myString);
    }

        public static String combinedString(String a, String b, char c){
            String myCombinedString;
           myCombinedString = a + c + b;
           return myCombinedString;


        }

        public static void printMyString(String myString){
            System.out.println(myString);
        }
     }





















