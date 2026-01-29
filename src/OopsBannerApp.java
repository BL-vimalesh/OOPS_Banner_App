import java.util.HashMap;

/**
 * OOPSBannerApp UC5 – Advanced OOP Concepts Implementation
 *
 * <p>This class demonstrates advanced Object-Oriented Programming concepts through the
 * creation and display of an ASCII art banner. It extends the functionality of Use Case 4
 * by implementing a modular, reusable character pattern system using the Collections Framework.</p>
 *
 * @author User
 * @version 5.0
 */

public class OopsBannerApp {
    private static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O',new String[]{
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        });

        map.put('P',new String[]{
                "******",
                "**  **",
                "**  **",
                "******",
                "**    ",
                "**    ",
                "**    "
        });

        map.put('S',new String[]{
                " ****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "**** "
        });
        return map;
    }

    private static void displayBanner(String message, HashMap<Character, String[]> map) {
        for (int i = 0; i < 7; i++) {
            StringBuilder builder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                builder.append(pattern[i]).append("  ");
            }
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, map);
    }
}