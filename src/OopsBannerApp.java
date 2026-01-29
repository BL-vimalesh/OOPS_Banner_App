/**
 * OOPSBannerApp UC2 - OOPS Banner Display Application
 * <p>
 * This class demonstrates the creation of ASCII art banner using Object-Oriented Programming principles.
 * It extends the basic banner concept by displaying the word "OOPS" in a visual format using asterisks (*)
 * and spaces to form each letter.
 *
 * @author User
 * @version 2.0
 */

public class OopsBannerApp {
    public static void main(String[] args) {
        String[] banner = {
                "  ***       ***     ******      *****",
                "**   **  **     **  **    **   **",
                "**   **  **     **  **     ** **",
                "**   **  **     **  **   **    **",
                "**   **  **     **  *****         ***",
                "**   **  **     **  **              **",
                "  ***       ***     **         *****"
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }
}