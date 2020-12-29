package com.company;

import java.util.Scanner;

public class Main {
    public static String camelToSnake(String str)
    {
        StringBuilder result = new StringBuilder();

        char c = str.charAt(0);
        result.append(Character.toLowerCase(c));
        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);


            if (Character.isUpperCase(ch)) {
                result.append('_');
                result.append(Character.toLowerCase(ch));
            }

            else {
                result.append(ch);
            }
        }

        // return the result
        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //System.out.print(camelToSnake(str));
        System.out.println(str.replace("word","letter"));
    }



}
