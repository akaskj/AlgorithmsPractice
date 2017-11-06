package main.java.problems;

import java.util.Scanner;

public class TimeConversion {

    static void timeConversion(String s) {
        StringBuilder a = new StringBuilder(s);

        if(a.charAt(a.length() - 2) == 'P') {
            int hr = Integer.parseInt(a.charAt(0) + "" + a.charAt(1));
            hr = hr + 12;
        }

        a.deleteCharAt(a.length() - 1);
        a.deleteCharAt(a.length() - 2);




    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String result = timeConversion(s);
//        System.out.println(result);

        timeConversion("07:05:45PM");
    }
}
