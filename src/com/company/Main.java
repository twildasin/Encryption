package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        char sub = ' ';
        Scanner kbin = new Scanner(System.in);
        String wrd = "";
        Random ran = new Random();
        int place = 0;
        int type = 0;
        int min;
        int max;
        String output = "";



        //For testing purposes only:                        //
        //System.out.println("Dec: " + dec(sub));           //
        //System.out.println("Hex: " + hex(sub));           //
        //System.out.println("Oct: " + oct(sub));           // Testing for conversions
        //System.out.println("Bin: " + bin(sub));           //
        //System.out.println("ASC: " + sub);                //


        System.out.println("Please input a word to be encoded");        //
        wrd = kbin.nextLine();                                          //  Asks user for a word to input and
        place = ran.nextInt(wrd.length()) +1;                           //  finds a random number based on word
        System.out.println(place);                                      //  length on where to start encoding
        min = place -1;                                                 //
        max = place;                                                    //
        System.out.println(wrd.substring(min,max));               //

        type = ran.nextInt(5) + 1;          //  Finds a random number to determine what encoding (hex, oct, etc.) to start with
        System.out.println(type);           //

        for(int i = 0; i <= wrd.length(); i++)
        {
            output += (type == 1 ? bin(sub) : "");      //
            output += (type == 2 ? oct(sub) : "");      //  Based on what type of conversion is done (based on int type),
            output += (type == 3 ? dec(sub) : "");      //  it will add that encoded value to the output string
            output += (type == 4 ? hex(sub) : "");      //
            output += (type == 5 ? sub : "");           //

            //if(max )



        }




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

    public static String oct (char in)
    {
        int out = 0;
        String out1 = "";
        out = (int) in;
        out1 = Integer.toOctalString(out);
        return out1;
    }

    public static String bin (char in)
    {
        int out = 0;
        String out1 = "";
        out = (int) in;
        out1 = Integer.toBinaryString(out);
        return out1;
    }

}
