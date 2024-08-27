/* Design pattern
P
P R
P R O
P R O G
P R O G R
P R O G R A
P R O G R A M
*/

package com.gentech.stringbuilder.assignmnent;

public class Assignment6a {
    public static void main(String[] args) {
            String word = "PROGRAM";

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(word.charAt(j) + " ");
                }
                System.out.println();  // Move to the next line after printing each row
            }

    }
}
