/**
 * OOPSBannerApp – OOPS Banner Application (Use Case 3)
 *
 * This class extends User Story 2 to display the "OOPS" banner using a modular approach
 * by implementing the Single Responsibility Principle (SRP) and Method Extraction.
 *
 * <p><b>Pattern:</b> String arrays representing ASCII art for letters O, P, and S are generated
 * and combined horizontally to create the visual "OOPS" message.</p>
 *
 * @author User
 * @version 3.0
 */

public class OopsBannerApp {
    private static String[] getOPattern() {
        String[] result = {
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        };
        return result;
    }

    private static String[] getPPattern() {
        String[] result = {
                "******",
                "**  **",
                "**  **",
                "******",
                "**    ",
                "**    ",
                "**    "
        };
        return result;
    }

    private static String[] getSPattern() {
        String[] result = {
                " ****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "**** "
        };
        return result;
    }

    public static void main(String[] args) {
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i]);
        }
    }
}