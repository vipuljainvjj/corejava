package com.vipul.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

    public static void main(String[] args) {
        String regex = "[0-9]$";
        String searchedString = "12345";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(searchedString);

        while(matcher.find()) {
            System.out.println(matcher.start() + ", " + matcher.end());
            System.out.println(">" + matcher.group() + "<");
        }

        System.out.println(matcher.matches());
        System.out.println(searchedString.matches(regex));

    }
}
