package com.ll;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(".... . .-.. .-.. ---"));
    }
}

class Solution {
    public String solution(String letter) {
        String answer = "";

        /*
        morse = {
                    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
                    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
                    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
                    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
                    '-.--':'y','--..':'z'
                }
         */
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                            "--.", "....", "..", ".---", "-.-", ".-..",
                            "--", "-.", "---", ".--.", "--.-", ".-.",
                            "...", "-", "..-", "...-", ".--", "-..-",
                            "-.--", "--.."};

        Map<String, Character> morseStr = new HashMap<>();

        for (int i = 0; i < morse.length; i++) {
            morseStr.put(morse[i], (char) (97 + i));
        }

        String[] splitLetter = letter.split(" ");

        for (String s : splitLetter) {
            answer += morseStr.get(s);
        }

        return answer;
    }
}