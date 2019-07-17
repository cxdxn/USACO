package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: crypt1
*/

import java.util.*;
import java.io.*;
public class crypt1 {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int n;
    static int[] digits;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("crypt1.in"));
            out = new PrintWriter(new File("crypt1.out"));

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
    	n = in.nextInt();
    	digits = new int[n];
    	for (int i = 0; i < n; i++) {
    		digits[i] = in.nextInt();
    	}

    }


    private static int solve() {
    	int result = 0;
        for (int i = 100; i <= 999; i++) {
        	for (int j = 10; j <= 99; j++) {
        		
        		//System.out.println(i + " " + j + " " + check(i) + " " + check(j) + " " + checkProduct(i, j));}
        		if (check(i) && check(j) && checkProduct(i, j)) {
        			result++;
        		}
        }
        }
        return result;
        }
    
    public static boolean checkProduct (int a, int b) {
    	int tplace = Integer.parseInt(Integer.toString(b).substring(0, 1));
    	int partial1 = a * (b % 10);
    	int partial2 = a * tplace;
    	int product = partial1 + partial2 * 10;
    	//System.out.println(partial2);
    	//System.out.println(check(partial1) + " " + check(partial2) + " " + check(product));
    	if (! check(partial1) || ! check(partial2) || ! check(product)) {
    		return false;
    	}
    	
    	if (countDigit(partial1) != 3 || countDigit(partial2) != 3 || countDigit(product) != 4) {
			return false;
		}
    	return true;
    }
    
    public static boolean check (int a) {
    	while (a > 0) {
    		int digit = a % 10;
    		if (!match(digit)) {
    			return false;
    		}
    		a /= 10;
    	}
    	return true;
    }
    
    public static int countDigit (int a) {
    	int c = 0;
    	while (a > 0) {
    		c++;
    		a /= 10;
    	}
    	return c;
    }
    public static boolean match (int a) {
    	for (int i = 0; i < n; i++) {
    		if (digits[i] == a) {
    			return true;
    		}
    	}
    	return false;
    }
}
