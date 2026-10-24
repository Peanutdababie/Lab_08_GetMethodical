public class DevTest {
    static void main() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String thing = SafeInput.getNonZeroLenString(input, "Enter any text");

        System.out.println("If you can see: "  + thing + " then it works!");


    }
}
