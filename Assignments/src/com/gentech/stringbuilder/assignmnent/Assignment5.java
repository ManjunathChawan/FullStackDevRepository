package com.gentech.stringbuilder.assignmnent;

public class Assignment5 {
    public static void main(String[] args) {
        String input = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String result = deleteDayOccurrences(input);
        System.out.println("Result: " + result);
    }

    public static String deleteDayOccurrences(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (i <= chars.length - 3 && chars[i] == 'D' && chars[i + 1] == 'A' && chars[i + 2] == 'Y') {
                i += 2;
            } else {
                result += chars[i];
            }
        }
        return result;
    }
}
