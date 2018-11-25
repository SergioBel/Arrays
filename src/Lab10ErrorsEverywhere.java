import java.util.ArrayList;
import java.util.Arrays;

public class Lab10ErrorsEverywhere {

    /**
     * In the code below, you should work top down to solve
     * each of the problems and DOCUMENT what the error was
     * and what you did to solve it.
     *
     * Understanding how to read errors is critical to efficient
     * coding - especially on the final exam!!
     *
     * I am playing with different ideas, but this may be one of the few things
     * you can bring into the final exam, so make sure it is a quality document
     */
        public static void main(String[] args) {
            //Error 1 - this one is easy, just read the error
            //and I'm confident everyone can solve it.
            System.out.println("~~~~~~~~~Error 1~~~~~~~~");
            System.out.println("I'm really starting to like Java");

            //Error 2
            System.out.println("~~~~~~~~~Error 2~~~~~~~~");
            int firstVariable = 10;
            int secondVariable = 20;

            //Error 3
            System.out.println("~~~~~~~~~Error 3~~~~~~~~");
            for (int thirdVariable=0; thirdVariable<10;thirdVariable++)
                System.out.println(thirdVariable + " JavaRocks!");

            //Error 4
            System.out.println("~~~~~~~~~Error 4~~~~~~~~");
            for (int i=1; i<=10; i++)
                System.out.print(i+" Yahoo! ");

            //Error 5
            System.out.println("~~~~~~~~~Error 5~~~~~~~~");
            int[] grades = {92, 99, 100, 87};
            System.out.printf("The grade in the 4th course is: %d%n", grades[3]);


            //Error 6 - there are 2 errors in this one question
            System.out.println("~~~~~~~~~Error 6~~~~~~~~");
            ArrayList<String> contacts = new ArrayList<>();
            System.out.printf("My first contact is %s%n", contacts.get(0));


            //Error 7 - this should only loop 5 times
            System.out.println("~~~~~~~~~Error 7~~~~~~~~");
            for (int i = 0; i < 5; i++)
                System.out.println("feels like forever...");

            //Error 8
            System.out.println("~~~~~~~~~Error 8~~~~~~~~");
            for (int i = 0; i < 3; i++) {
                System.out.println("Doing something");
                System.out.printf("The final value for i is: %d%n", i);
            }

            //Error 9
            System.out.println("~~~~~~~~~Error 9~~~~~~~~");


            //Error 10 - watch the logic
            System.out.println("~~~~~~~~~Error 10~~~~~~~~");
            double answer = 11.0 / 2.0;
            if (answer > 5.0)
                System.out.println("11/2 is 5.5 which is greater than 5");
            else
                System.out.println("11/2 is 5.5 which is greater than 5, but " +
                        "the if statement thinks it's not greater than 5");

            //Error 11
            System.out.println("~~~~~~~~~Error 11~~~~~~~~");
            String firstName = getFirstName();
            String firstName2 = getFirstName2();
        }

        public static void coolMethod(){
            System.out.println("This is a cool method-but what is wrong?");
        }

        //Error 11 continuted
        public static String getFirstName()
        {
            return "Ted";
        }

        //Error 12
        public static String getFirstName2()
        {
            return "Ted";
        }

        //Error 13 - reached end of file while parsing - what is that about?



    }
