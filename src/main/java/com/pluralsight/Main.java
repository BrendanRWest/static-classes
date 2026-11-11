package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String fullName = "Dr. Mel B Johnson, PhD";
        System.out.println(NameFormatter.format(fullName));

        String fullName2 = "Dr. Mel B Johnson";
        System.out.println(NameFormatter.format(fullName2));

        String fullName3 = "Mel B Johnson, PhD";
        System.out.println(NameFormatter.format(fullName3));

        String fullName4 = "Mel B Johnson";
        System.out.println(NameFormatter.format(fullName4));

        String fullName5 = "Dr. Mel Johnson, PhD";
        System.out.println(NameFormatter.format(fullName5));

        String fullName6 = "Mel Johnson, PhD";
        System.out.println(NameFormatter.format(fullName6));

        String fullName7 = "Dr. Mel Johnson";
        System.out.println(NameFormatter.format(fullName7));

        String fullName8 = "Mel Johnson";
        System.out.println(NameFormatter.format(fullName8));


    }
}
