package com.rakovets.course.java.core.practice.string;

import java.util.Locale;

public class StringUtil {
    static String getOneStringOfTwo(String str1, String str2) {
        return str1.concat(str2);
    }

    static int getIndexOfChar(char c, String str) {
        return str.indexOf(c);
    }

    static boolean isEqualsTwoStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    static String getTrimAndLowerCase(String str){
        return str.trim().toLowerCase();
    }
}
