package com.pelletier.john;
import java.util.Scanner;
import java.io.Console;

import static java.lang.System.exit;

class MyClass {
    public static void main(String[] args) {
        int age = -1, salary = -1;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String fullLine = myObj.nextLine();
        System.out.println(fullLine);

        String delims = "[ ]+";
        String[] tokens = fullLine.split(delims);

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equalsIgnoreCase("q")) {
                System.out.println("Quitting!");
                exit(0);
            }
        }

        String name = tokens[0];

        // Numerical input
        if (tokens.length > 1)
            age = Integer.parseInt(tokens[1]);
        if (tokens.length > 2)
            salary = Integer.parseInt(tokens[2]);

        // Output input by user
        System.out.println("Name: " + name);
        if (age != -1)
            System.out.println("Age: " + age);
        if (salary != -1)
            System.out.println("Salary: " + salary);
    }
}

