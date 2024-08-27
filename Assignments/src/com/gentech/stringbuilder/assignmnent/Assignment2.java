/*without using reverse method, reverse the given string
    a. charAt
    b. toCharArray
    c. subString
 */

package com.gentech.stringbuilder.assignmnent;

public class Assignment2 {
    public static void main(String[] args) {
        // Reverse using charAt
        String reversedCharAt = reverseUsingCharAt("Hello, World");
        System.out.println("Reversed using charAt: " + reversedCharAt);

        // Reverse using toCharArray
        String reversedToCharArray = reverseUsingToCharArray("Hello, World");
        System.out.println("Reversed using toCharArray: " + reversedToCharArray);

        // Reverse using substring
        String reversedSubstring = reverseUsingSubstring("Hello, World");
        System.out.println("Reversed using substring: " + reversedSubstring);
    }

    // Method 1: Reverse using charAt
    public static String reverseUsingCharAt(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Method 2: Reverse using toCharArray
    public static String reverseUsingToCharArray(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    // Method 3: Reverse using substring
    public static String reverseUsingSubstring(String str) {
        String reversed = "";
        for (int i = str.length(); i > 0; i--) {
            reversed += str.substring(i - 1, i);
        }
        return reversed;
    }
}