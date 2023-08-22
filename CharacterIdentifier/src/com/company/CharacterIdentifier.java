package com.company;
import java.util.Scanner;

public class CharacterIdentifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);
        identifyCharacter(ch);
        scan.close();
    }
    
    public static void identifyCharacter(char ch) {
        if (Character.isLowerCase(ch) && "aeiou".contains(String.valueOf(ch))) {
        	System.out.println( "Lower Case vowel");
        } else if (Character.isUpperCase(ch) && "AEIOU".contains(String.valueOf(ch))) {
            System.out.println( "Upper-case vowel");
        } else if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
        	System.out.println( "Lower-case constant");;
        } else if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
        	System.out.println( "Upper-case constatnt");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
