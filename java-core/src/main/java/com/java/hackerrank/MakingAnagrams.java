package com.java.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
                count -=1;
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
        int count = 0;

        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
