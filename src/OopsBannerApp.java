/**
 * OOPSBannerApp UC4 – Banner Display Application with Character Pattern Mapping
 * <p>
 * This class demonstrates key Object-Oriented Programming (OOP) concepts through
 * a banner display system that renders text using ASCII art patterns.
 *
 * @author Developer
 * @version 1.0
 */

public class OopsBannerApp {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        };

        String[] pPattern = {
                "******",
                "**  **",
                "**  **",
                "******",
                "**    ",
                "**    ",
                "**    "
        };

        String[] sPattern = {
                " ****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "**** "
        };

        String[] spacePattern = {
                "    ",
                "    ",
                "    ",
                "    ",
                "    ",
                "    ",
                "    "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}