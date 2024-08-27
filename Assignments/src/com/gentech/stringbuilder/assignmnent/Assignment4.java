package com.gentech.stringbuilder.assignmnent;

public class Assignment4 {
    public static void main(String[] args) {
        String input = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String result = insertCommas(input);
        System.out.println("Result: " + result);
    }

    public static String insertCommas(String str) {
        char[] chars = str.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            result += chars[i];

            if (i >= 2 && chars[i] == 'Y' && chars[i-1] == 'A' && chars[i-2] == 'D') {
                result += ',';
            }
        }
        return result;
    }
}
