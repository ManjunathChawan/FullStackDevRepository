/*Design pattern
P
P R
P R O
P R O G
P R O G R
P R O G R A
P R O G R A M
P R O G R A
P R O G R
P R O G
P R O
P R
P
 */

package com.gentech.stringbuilder.assignmnent;

public class Assignment6b {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
