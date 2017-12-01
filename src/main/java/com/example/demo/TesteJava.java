package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteJava {
    public static void main(String[] args) {

        String cellNumber = "(11) 99258-1581";

        cellNumber = StringUtils.trimAllWhitespace(cellNumber);


        System.out.println(cellNumber);
        Pattern pattern = Pattern.compile("^\\(([0-9]{2})\\)([0-9]{5})-([0-9]{4})");
        Matcher matcher = pattern.matcher(cellNumber);

        System.out.println(matcher.find());
        while(matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
