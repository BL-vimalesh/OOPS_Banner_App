/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by storing banner lines in a String array
 * and printing them using a loop. This eliminates repetitive print statements
 * and improves modularity, readability, and reusability.
 *
 * @author User
 * @version 4.0
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];
        lines[0] = String.join(" ","  ***  ", "    ***  ", "******", " **** ");
        lines[1] = String.join(" "," **   **", " **   **", "**   **", "**    ");
        lines[2] = String.join(" "," **   **", " **   **", "**   **", "**    ");
        lines[3] = String.join(" "," **   **", " **   **", "******", " **** ");
        lines[4] = String.join(" "," **   **", " **   **", "**     ", "    **");
        lines[5] = String.join(" "," **   **", " **   **", "**     ", "    **");
        lines[6] = String.join(" ","  ***  ", "  ***  ", "**     ", "**** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}