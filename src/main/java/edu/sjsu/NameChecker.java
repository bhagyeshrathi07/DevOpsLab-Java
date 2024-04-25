package edu.sjsu;

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
        // Check length
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Check for invalid starting character
        char firstChar = input.charAt(0);
        if (!Character.isLetter(firstChar) && firstChar != '\'' && firstChar != '-') {
            return false;
        }

        // Check for consecutive hyphens or single quotes
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            if ((currentChar == '-' || currentChar == '\'') && (nextChar == '-' || nextChar == '\'')) {
                return false;
            }
        }

        // Check for invalid characters
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c) && c != '\'' && c != '-') {
                return false;
            }
        }

        return true;
    }
}
