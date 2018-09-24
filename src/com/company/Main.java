package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        System.out.println(hex('a'));




    }

    public static int dec (char in)
    {
        int out = 0;
        out = (int) in;
        return out;
    }

    public static String hex (char in)
    {
        int out = 0;
        String out1 = "";
        out = (int) in;
        out1 = Integer.toHexString(out);
        return out1;
    }

    public static int oct (char in)
    {
        int out = 0;
        int out1 = "";
        out = (int) in;
        out1 = Integer.toHexString(out);
        return out1;
    }

}
