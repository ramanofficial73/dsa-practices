package com.dsa.practices.dec2024.dec24;

import java.util.Arrays;
import java.util.List;

public class LeetCode_String_58_LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
    }

    public static int lengthOfLastWord(String s) {
        List<String> stringList = Arrays.asList(s.split(" "));
        String lastWord = stringList.get(stringList.size() - 1);
        return lastWord.length();
    }

}
