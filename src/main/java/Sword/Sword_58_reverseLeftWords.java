package Sword;

public class Sword_58_reverseLeftWords {
    public String reverseLeftWords(String s, int n) {

        String rest = s.substring(0,n);
        String front = s.substring(n);
        return front+rest;
    }
}
