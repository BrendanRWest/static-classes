package com.pluralsight;

public class NameFormatter {

    private static String name;
    private static String[] tokens;

    private NameFormatter(){
    }

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName,
                                String middleName, String lastName, String suffix){
        return lastName + ", " + prefix + " " + firstName + " " + middleName.substring(0,1)
                + ", " + suffix;
    }

    public static String format(String fullName){
        tokens = fullName.split(" ");

        switch(tokens.length){
            case 2:
                return tokens[1] + ", " + tokens[0];
        }
    }

    }
}
