/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case refactors the banner rendering logic into
 * dedicated helper methods for each character (O, P, S).
 * This improves modularity, reusability, and maintainability
 * by separating pattern generation from display logic.
 *
 * @author User
 * @version 6.0
 */

public class OOPSBannerApp  {
    public static String[] getOPattern() {
        return new String[]{
                "   ***  ",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "******",
                "**   **",
                "**   **",
                "******",
                "**     ",
                "**     ",
                "**     "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " **** ",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                    String.join(" ",
                            oPattern1[i],
                            oPattern2[i],
                            pPattern[i],
                            sPattern[i]
                    )
            );
        }
    }
}