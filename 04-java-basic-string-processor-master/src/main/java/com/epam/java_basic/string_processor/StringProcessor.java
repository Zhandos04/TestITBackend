package com.epam.java_basic.string_processor;

import java.util.Arrays;

/**
 *  Useful methods for string processing
 */
public class StringProcessor {

    public String findShortestLine(String[] lines) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < lines.length; i++) {
            if(min > lines[i].length()) {
                index = i;
                min = lines[i].length();
            }
        }
        return lines[index];
    }

    public String findLongestLine(String[] lines) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < lines.length; i++) {
            if(max < lines[i].length()) {
                index = i;
                max = lines[i].length();
            }
        }
        return lines[index];
    }

    public String[] findLinesShorterThanAverageLength(String[] lines) {
        String[] ans = new String[lines.length];
        int index = 0;
        double avgLength = 0;
        for (int i = 0; i < lines.length; i++) {
            avgLength += lines[i].length();
        }
        avgLength /= lines.length;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].length() < avgLength) {
                ans[index] = lines[i];
                index++;
            }
        }
        String[] arr = new String[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
        return arr;
    }

    public String[] findLinesLongerThanAverageLength(String[] lines) {
        String[] ans = new String[lines.length];
        int index = 0;
        double avgLength = 0;
        for (int i = 0; i < lines.length; i++) {
            avgLength += lines[i].length();
        }
        avgLength /= lines.length;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].length() > avgLength) {
                ans[index] = lines[i];
                index++;
            }
        }
        String[] arr = new String[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
        return arr;
    }

    /**
     * Find word with minimum various characters. Return first word if there are a few of such words.
     * @param words Input array of words
     * @return First word that consist of minimum amount of various characters
     */
    public String findWordWithMinimumVariousCharacters(String[] words) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            String[] arr = words[i].split("");
            Arrays.sort(arr);
            for (int j = 1; j < arr.length; j++) {
                if(!arr[j].equals(arr[j - 1])) {
                    cnt++;
                }
            }
            if(cnt < min) {
                min = cnt;
                cnt = 0;
                ans = words[i];
            }
        }
        return ans;
    }

    /**
     * Find word containing only of various characters. Return first word if there are a few of such words.
     * @param words Input array of words
     * @return First word that containing only of various characters
     */
    public String findWordConsistingOfVariousCharacters(String[] words) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            String[] arr = words[i].split("");
            Arrays.sort(arr);
            for (int j = 1; j < arr.length; j++) {
                if(arr[j].equals(arr[j - 1])) {
                    cnt++;
                }
            }
            if(cnt < min) {
                min = cnt;
                cnt = 0;
                ans = words[i];
            }
        }
        return ans;
    }

    /**
     * Find word containing only of digits. Return second word if there are a few of such words.
     * @param words Input array of words
     * @return Second word that containing only of digits
     */
    public String findWordConsistingOfDigits(String[] words) {
        String ans = "";
        String ans1 = "";
        for (int i = 0; i < words.length; i++) {
            if(!ans1.equals("")) {
                return ans1;
            }
            for (int j = 0; j < words[i].length(); j++) {
                if(!Character.isDigit(words[i].charAt(j))) {
                    break;
                }if(j == words[i].length() - 1) {
                    if(ans.equals("")) {
                        ans = words[i];
                    }else {
                        ans1 = words[i];
                    }
                }
            }
        }
        if(!ans1.equals("")) {
            return ans1;
        }
        return ans;
    }
}
