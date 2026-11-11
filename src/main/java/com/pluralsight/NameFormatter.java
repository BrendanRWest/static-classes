package com.pluralsight;

public class NameFormatter {

    private static String name;
    private static String[] tokens;
    private static String[] parts;

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
        if(fullName.contains(",")) {
            parts = fullName.split(",", 2);

            String partOfName = parts[0].trim();
            String suffixPart = parts[1].trim();

            tokens = partOfName.split(" ");

            if (tokens[0].contains(".")) {
                String prefixPart = tokens[0];
                if (tokens.length > 3) {
                    String firstNamePart = tokens[1];
                    String middleNamePart = tokens[2];
                    String lastNamePart = tokens[3];
                    return lastNamePart + ", " + prefixPart + " " + firstNamePart +
                            " " + middleNamePart + ", " + suffixPart;
                } else {
                    String firstNamePart = tokens[1];
                    String lastNamePart = tokens[2];
                    return lastNamePart + ", " + prefixPart + " " + firstNamePart +
                            ", " + suffixPart;
                }
            } else {
                if (tokens.length > 2) {
                    String firstNamePart = tokens[0];
                    String middleNamePart = tokens[1];
                    String lastNamePart = tokens[2];
                    return lastNamePart + ", " + firstNamePart +
                            " " + middleNamePart + ", " + suffixPart;
                } else {
                    String firstNamePart = tokens[0];
                    String lastNamePart = tokens[1];
                    return lastNamePart + ", " + firstNamePart +
                            ", " + suffixPart;
                }
            }

        } else {
            tokens = fullName.split(" ");
            if (tokens[0].contains(".")) {
                String prefixPart = tokens[0];
                if (tokens.length > 3) {
                    String firstNamePart = tokens[1];
                    String middleNamePart = tokens[2];
                    String lastNamePart = tokens[3];
                    return lastNamePart + ", " + prefixPart + " " + firstNamePart +
                            " " + middleNamePart;
                } else {
                    String firstNamePart = tokens[1];
                    String lastNamePart = tokens[2];
                    return lastNamePart + ", " + prefixPart + " " + firstNamePart;
                }
            } else {
                if (tokens.length > 2) {
                    String firstNamePart = tokens[0];
                    String middleNamePart = tokens[1];
                    String lastNamePart = tokens[2];
                    return lastNamePart + ", " + firstNamePart +
                            " " + middleNamePart;
                } else {
                    String firstNamePart = tokens[0];
                    String lastNamePart = tokens[1];
                    return lastNamePart + ", " + firstNamePart;
                }
            }
          }


    }
}
