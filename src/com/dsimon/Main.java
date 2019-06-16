package com.dsimon;

public class Main {

    public static void main(String[] args) {
        // width 16 (2 bytes)
	    char myChar = '\u00A9';
        System.out.println(myChar);

        // holds true or false
        boolean myBoolean = true;
        boolean isMale = true;

        //  Find the code for the registered symbol
        //  Create a variable of type char and assign it the unicode value for that symbol
        //  Display it on the screen

        char registeredSymbol = '\u2122';
        System.out.println(registeredSymbol);
    }
}
