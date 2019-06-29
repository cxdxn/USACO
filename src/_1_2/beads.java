package _1_2;

/*
ID: cadenka1
LANG: JAVA
TASK: beads
*/

import java.util.*;
import java.io.*;
public class beads {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static String [] list;
    static String num, characters;
    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("beads.in"));
            out = new PrintWriter(new File("beads.out"));

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
    	
    	num = in.nextLine();
    	characters = in.nextLine();


    }


    private static String solve() {
        String result = "";
        int n = Integer.parseInt(num);
    	characters += characters;
        int max = 0;
        
        for (int i = 0; i < characters.length()/2; i++) {
        	int c = 1;
        	char start = characters.charAt(i);
        	if (start == 'w') {
        		c = Math.max(method('r', i), method('b', i));
        	}
        	else {
        		c = method(start, i);
        	}
        	
        	if (max < c) {
        		max = c;
        	}
        }
        
        result = "" + max;
        return result;

    }
    
    private static int method(char first, int n) {
        boolean flag = false;
        int idx = n+1;
        int c = 1;
    	while (c < characters.length()/2) {
    		char curr = characters.charAt(idx);
    		//System.out.println(curr);
    		if (!flag) {
       			if (curr == first || curr == 'w') {
        				c++;
        			}
        			else {
        				flag = true;
        				c++;
        			}
        		}
        	else {
        		if (curr != first || curr == 'w') {
        			c++;
        		}
        		else {
        			break;
        		}
        	}
    		idx++;
        }
    	//System.out.println(c);
    	return c;
    }

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}
