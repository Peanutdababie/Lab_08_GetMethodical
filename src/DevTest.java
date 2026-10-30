public class DevTest {
    static void main() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String thing = SafeInput.getNonZeroLenString(input, "Enter any text");

        System.out.println("If you can see: "  + thing + " \nthen it works!");


        int otherThing = SafeInput.getInt(input, "Enter any number");

        System.out.println("if you can see " + otherThing +"\nthen it works!");

        double otherThingDeluxe = SafeInput.getInt(input, "Enter any number");
        System.out.println("if you can see " + otherThingDeluxe +"\nthen it works!");


        int rangedThing = SafeInput.getRangedInt(input, "Enter a number between 1 and 10", 1, 10);
        System.out.println("if you can see " + rangedThing + "\nthen it works!");


    }
}
