package _1_2;

/*
ID: cadenka1
LANG: JAVA
TASK: ride
*/

import java.util.*;
import java.io.*;
public class ride {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static String [] list;
    static String comet, group;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("ride.in"));
            out = new PrintWriter(new File("ride.out"));

            init();

            //Write out file
            out.println(solve());

            out.close();
            in.close();

        }catch(Exception e) {
            e.printStackTrace();
        }



    }

    private static void init() {
        //Get data 
        //Initialize Input Variables
    	comet = in.nextLine();
    	group = in.nextLine();


    }


    private static String solve() {
        String result = "";
        int n1 = 1;
        int n2 = 1;
        
        for (int i = 0; i < comet.length(); i++) {
        	n1 *= letter(comet.charAt(i));
        }
        
        for (int i = 0; i < group.length(); i++) {
        	n2 *= letter(group.charAt(i));
        }
        
        if (n1 % 47 == n2 % 47) {
        	result = "GO";
        }
        
        else {
        	result = "STAY";
        }
        
        return result;
    }
    
    private static int letter(char l) {
		int num = ' ';
		switch(l) {
			case 'A':
				num = 1;
				break;
			case 'B':
				num = 2;
				break;
			case 'C':
				num = 3;
				break;
			case 'D':
				num = 4;
				break;
			case 'E':
				num = 5;
				break;
			case 'F':
				num = 6;
				break;
			case 'G':
				num = 7;
				break;
			case 'H':
				num = 8;
				break;
			case 'I':
				num = 9;
				break;
			case 'J':
				num = 10;
				break;
			case 'K':
				num = 11;
				break;
			case 'L':
				num = 12;
				break;
			case 'M':
				num = 13;
				break;
			case 'N':
				num = 14;
				break;
			case 'O':
				num = 15;
				break;
			case 'P':
				num = 16;
				break;
			case 'Q':
				num = 17;
				break;
			case 'R':
				num = 18;
				break;
			case 'S':
				num = 19;
				break;
			case 'T':
				num = 20;
				break;
			case 'U':
				num = 21;
				break;
			case 'V':
				num = 22;
				break;
			case 'W':
				num = 23;
				break;
			case 'X':
				num = 24;
				break;
			case 'Y':
				num = 25;
				break;
			case 'Z':
				num = 26;
				break;
		}
		return num;
	}

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}
