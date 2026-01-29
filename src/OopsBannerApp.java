/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * in a single statement using inline initialization with String.join().
 * This approach reduces verbosity while maintaining modularity and readability.
 *
 * @author User
 * @version 5.0
 */

public class OopsBannerApp {

    public static void main(String[] args) {
        String[] lines = {
                String.join(" ","  ***  ", "    ***  ", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", "  ***  ", "  ***  ", "**     ", "**** ")
        };


        for (String line : lines) {
            System.out.println(line);
        }
    }
}