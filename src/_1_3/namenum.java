package _1_3;

/*
ID: cadenka1
LANG: JAVA
TASK: namenum
*/

import java.util.*;
import java.io.*;
public class namenum {

static Scanner in;
static PrintWriter out;

//Input Variables
    static String num;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("namenum.in"));
            out = new PrintWriter(new File("namenum.out"));

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
    	num = in.nextLine();


    }


    private static String solve() throws FileNotFoundException {
        String result = "";
        ArrayList<String> names = new ArrayList<String>();
        Scanner dict = new Scanner(new File("dict.txt"));
        while (dict.hasNextLine()) {
        	names.add(dict.nextLine());
        }
        
        ArrayList<String> valid = new ArrayList<String>();
        for (String s : names) {
        	if (change(s).equals(num)) {
        		valid.add(s);
        	}
        }
        
        if (valid.size() == 0) {
        	return "NONE" + "\n";
        }
        for (int i = 0; i < valid.size(); i++) {
        	result += valid.get(i) + "\n";
        }
        
        return result;

    }
    
    private static String change(String s) {
    	String temp = "";
    	for (int i = 0; i < s.length(); i++) {
    		temp += values(s.charAt(i));
    	}
    	
    	//System.out.println(temp);
    	return temp;
    }
    
    private static int values(char a) {
		switch (a){
		case 'A': case 'B':	case 'C': 
			return 2;
		case 'D': case 'E': case 'F':
			return 3;
		case 'G': case 'H': case 'I':
			return 4;
		case 'J': case 'K': case 'L':
			return 5;
		case 'M': case 'N': case 'O':
			return 6;
		case 'P': case 'R': case 'S':
			return 7;
		case 'T': case 'U': case 'V':
			return 8;
		case 'W': case 'X': case 'Y':
			return 9;
		}
		return 0;
    }

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}
