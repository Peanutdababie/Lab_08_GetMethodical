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

        //yeah this isn't working lmao, it gets stuck in a do loop no matter the input made
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                userNumber = pipe.nextInt();
            }else{
                garbageString = pipe.nextLine();
                System.out.println("You made a bad input: " + garbageString + "\nPlease try again.");

            }
        }while(!garbageString.equals(prompt));





        return userNumber;


    }

}
    public static double getDouble(Scanner pipe)
