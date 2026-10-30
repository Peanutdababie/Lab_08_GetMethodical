import java.util.Scanner;

public class SafeInput {
    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @return a String response that is not zero length

     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)

    {

        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do

        {

            System.out.print("\n" +prompt + ": "); // show prompt add space

            retString = pipe.nextLine();

        }while(retString.length() == 0);



        return retString;

    }


    /**
     *
     *
     * @param pipe       a Scanner opened to read from System.in
     * @param prompt     prompt for the user
     * @return an int response that is not zero length
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int userNumber = 0;
        String garbageString = "";
        boolean garbageFlag = false;

        //yeah this isn't working lmao, it gets stuck in a do loop no matter the input made
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                userNumber = pipe.nextInt();
                garbageFlag = true;
            }else{
                garbageString = pipe.nextLine();
                System.out.println("You made a bad input: " + garbageString + "\nPlease try again.");

            }
        }while(!garbageFlag);





        return userNumber;


    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("That is not a valid double.");
            }

        } while(!done);

        return value;
    }
}
