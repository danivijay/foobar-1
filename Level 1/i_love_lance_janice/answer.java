package com.google.challenges; //only applicable for Google Challenges aka foo.bar
public class Answer {
    public static String answer(String s) { 
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if( c >= 'a' && c <= 'z' ) {
                c = (char)((int)('z' - c + 'a')); 
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
