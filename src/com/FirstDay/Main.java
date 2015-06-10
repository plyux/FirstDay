package com.FirstDay;

import java.util.Scanner;

/**
 * Created by Вевдюк on 10.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Input you line: ");
        String inputLine = " ";
        Scanner scanner = new Scanner(System.in);
        inputLine = scanner.nextLine();
        char requiredChar = DoThis.Find(inputLine);
        System.out.println("Required symbol is: " + requiredChar);
    }
}
