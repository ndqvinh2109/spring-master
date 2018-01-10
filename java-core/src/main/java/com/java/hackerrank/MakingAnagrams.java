package com.java.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MakingAnagrams {

    /*
    * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
    *
    * */

    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> occurenceMap = new HashMap<>();
        int count = 0;

        for(char firstC: first.toCharArray()) {
            if( !occurenceMap.containsKey(firstC) ) {
                occurenceMap.put(firstC, 1);
            } else {
                occurenceMap.put(firstC, occurenceMap.get(firstC) + 1);
            }
        }

        for(char secondC: second.toCharArray()) {
            if( !occurenceMap.containsKey(secondC) ) {
                count--;
            } else {
                occurenceMap.put(secondC, occurenceMap.get(secondC) - 1);
            }
        }

        for(Map.Entry<Character,Integer> entry: occurenceMap.entrySet()){
            if(entry.getValue() != 0){
                count += Math.abs(entry.getValue());
            }
        }

        return count;
    }

    public static int numberNeeded2(String first, String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

    public static int numberNeededJava8(String first, String second) {
        int[] letters = new int[26];
        first.chars().forEach(c -> { letters[c - 'a']++; });
        second.chars().forEach(c -> { letters[c - 'a']--;});
        return IntStream.of(letters).map(Math::abs).sum();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeededJava8(a, b));
    }
}
