package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        char sub;                               //Used to store char to encode
        Scanner kbin = new Scanner(System.in);  //Used for keyboard inputs
        String wrd;                             //String for the user input to be stored
        Random ran = new Random();              //Random. Sorry i use this not the math class
        int place;                              //Used to store rand
        int type;                               //Used to store which encoding (hex, dec, etc.) us being performed
        int val;                                //Used to store which char (position) is being used. (Where to take a charAt)
        String output = "";                     //Used to store final output through concatenation

        //System.out.println("Dec: " + dec(sub));           //
        //System.out.println("Hex: " + hex(sub));           //
        //System.out.println("Oct: " + oct(sub));           // For testing use only
        //System.out.println("Bin: " + bin(sub));           //
        //System.out.println("ASC: " + sub);                //

        System.out.println("Please input a word to be encoded");        //
        wrd = kbin.nextLine();                                          //  Asks user for a word to input and
        place = ran.nextInt(wrd.length()) +1;                           //  finds a random number based on word
        //System.out.println(place);                                      //  length on where to start encoding
        val = place -1;

        type = ran.nextInt(5) + 1;          //  Finds a random number to determine what encoding (hex, oct, etc.) to start with
        //System.out.println(type);                  //

        sub = wrd.charAt(val);  // Takes the char from the string and stores it as "sub"
        //System.out.println(sub);

        for(int i = 0; i < wrd.length(); i++)                 //Repeats enough times so every char in the string is encoded
        {
            output += (type == 1 ? bin(sub) + " " : "");      //
            output += (type == 2 ? oct(sub) + " " : "");      //  Based on what type of conversion is done (based on int type),
            output += (type == 3 ? dec(sub) + " " : "");      //  it will add that encoded value to the output string
            output += (type == 4 ? hex(sub) + " " : "");      //
            output += (type == 5 ? sub + " " : "");           //

            type = (type==5 ? 1 : type + 1);                    // Adds a value of one it "type" unless its at 5 (max), then resets to 1.
            val = (val==wrd.length()-1 ? 0 : val + 1);          // Adds a value of one it "val" unless its at max, then resets to 0.

            sub = wrd.charAt(val);                  // Takes the char from the string and stores it as "sub"

        }

        System.out.println("Your phrase: \"" + wrd + "\" is:\n" + output);

    }

    private static int dec (char in)     //Subroutine to convert char to decimal
    {
        int out;
        out = (int) in;
        return out;
    }

    private static String hex (char in)     //Subroutine to convert char to hexadecimal
    {
        int out;
        String out1;
        out = (int) in;
        out1 = Integer.toHexString(out);
        return out1;
    }

    private static String oct (char in)     //Subroutine to convert char to octal
    {
        int out;
        String out1;
        out = (int) in;
        out1 = Integer.toOctalString(out);
        return out1;
    }

    private static String bin (char in)     //Subroutine to convert char to binary
    {
        int out;
        String out1;
        out = (int) in;
        out1 = Integer.toBinaryString(out);
        return out1;
    }

}
