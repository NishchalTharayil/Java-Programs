package com.company;
import java.util.*;

public class Java_ifelse {
    public static void Weird(int n)
    {
        if(n%2 != 0)
        {
            System.out.println("Weird");
        }
        else if(n % 2 == 0 && n>=2 && n<6)
        {
            System.out.println("Not Weird");
        }
        else if(n % 2 == 0 && n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        Weird(n);
        scanner.close();
    }
}
