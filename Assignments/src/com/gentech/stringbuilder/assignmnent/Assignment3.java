//without using replace, replace the old string with new string

package com.gentech.stringbuilder.assignmnent;

public class Assignment3 {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String oldSubstring = "World";
        String newSubstring = "Universe";

        String replacedString = replaceSubstring(originalString, oldSubstring, newSubstring);
        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceSubstring(String original, String oldSubstring, String newSubstring) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int length = oldSubstring.length();

        while (i <= original.length() - length) {
            String currentSubstring = original.substring(i, i + length);
            if (currentSubstring.equals(oldSubstring)) {
                result.append(newSubstring);
                i += length; // Skip the length of the old substring
            } else {
                result.append(original.charAt(i));
                i++;
            }
        }

        // Append the remaining characters
        result.append(original.substring(i));

        return result.toString();
    }
}
