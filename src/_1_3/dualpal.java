package _1_3;

/*
ID: cadenka1
LANG: JAVA
TASK: dualpal
*/

import java.util.*;
import java.io.*;
public class dualpal {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int n, s;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("dualpal.in"));
            out = new PrintWriter(new File("dualpal.out"));

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
    	n = in.nextInt();
    	s = in.nextInt();
    	
    }


    private static String solve() {
/*       ArrayList<String> res = new ArrayList<String>();
        int n1 = n;
        int x = 1;
        
        while (n1 > 0) {
        	for (int i = 2; i <= 10; i++) {
        		if (isPalindrome(baseConversion(Integer.toString(s+x), 10, i))) {
        			res.add(Integer.toString(s+x));
        		}
        	}
        }*/
        
        
        String result = "";
        int nres = 0;
        int x = s + 1;
        while (nres < n) {
        	int num = 0;
        	for (int i = 2; i <= 10; i++) {
        		if (isPalindrome(baseConversion(Integer.toString(x), 10, i))) {
        			num++;
        		}
        	}
        	if (num >= 2) {
        		result += x + "\n";
        		nres++;
        	}
        	x++;
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
