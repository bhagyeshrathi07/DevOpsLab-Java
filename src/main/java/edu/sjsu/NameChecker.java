package edu.sjsu;
import java.util.regex.*;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        String namex = "^[a-zA-Z][a-zA-Z-' ]{0,38}[a-zA-Z]$";
        Pattern pattern = Pattern.compile(namex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            if (input.contains("--") || input.startsWith("-") || input.endsWith("-") || input.startsWith("'") || input.endsWith("'") || input.contains("''") || input.contains(" ")) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
}
