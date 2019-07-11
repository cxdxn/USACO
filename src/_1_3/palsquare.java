package _1_3;

/*
ID: cadenka1
LANG: JAVA
TASK: palsquare
*/

import java.util.*;
import java.io.*;
public class palsquare {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int base;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("palsquare.in"));
            out = new PrintWriter(new File("palsquare.out"));

            init();

            //Write out file
            out.print(solve());

            out.close();
            in.close();

        }catch(Exception e) {
            e.printStackTrace();
        }



    }

    private static void init() {
        //Get data 
        //Initialize Input Variables
    	base = in.nextInt();

    }


    private static String solve() {
        String result = "";
        
        
        for (int i = 1; i <= 300; i++) {
        	String q = "" + i;
        	String n = baseConversion(q, 10, base).toUpperCase();
        	String s = "" + (i * i);
        	String square = baseConversion(s, 10, base).toUpperCase();
        	
        	if(isPalindrome(square)) {
        		result += n + " " + square + "\n";
        	}
        }
        
        return result;

    }
    
    public static String baseConversion(String number, int sBase, int dBase) {
    	return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }
    
    public static boolean isPalindrome(String s) {
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
    			return false;
    		}
    	}
    	return true;
    }
    
}
