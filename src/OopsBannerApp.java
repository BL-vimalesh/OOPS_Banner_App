/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends UC2 by using the String.join() method
 * to construct each line of the "OOPS" banner. This approach
 * improves memory efficiency and code readability by avoiding
 * multiple intermediate String objects created using the +
 * operator.
 *
 * @author User
 * @version 3.0
 */
public class OopsBannerApp {
    public static void main(String[] args) {
        System.out.println(String.join(" ","  ***  ", "    ***  ", "******", " **** "));
        System.out.println(String.join(" "," **   **", " **   **", "**   **", "**    "));
        System.out.println(String.join(" "," **   **", " **   **", "**   **", "**    "));
        System.out.println(String.join(" "," **   **", " **   **", "******", " **** "));
        System.out.println(String.join(" "," **   **", " **   **", "**     ", "    **"));
        System.out.println(String.join(" "," **   **", " **   **", "**     ", "    **"));
        System.out.println(String.join(" ","  ***  ", "  ***  ", "**     ", "**** " ));
    }
}