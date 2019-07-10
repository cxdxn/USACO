package _1_3;

/*
ID: cadenka1
LANG: JAVA
TASK: transform
*/

import java.util.*;
import java.io.*;
public class transform {



static Scanner in;
static PrintWriter out;

//Input Variables
    static int n;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("transform.in"));
            out = new PrintWriter(new File("transform.out"));

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
    }


    private static int solve() {
        int result = 0;

    	char[][] a = new char[n][n];
    	char[][] b = new char[n][n];
    	
    	for (int i = 0; i < n; i++) {
    		String temp = in.next();
    		for (int j = 0; j < n; j++) {
    			a[i][j] = temp.charAt(j);
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
    		String temp = in.next();
    		for (int j = 0; j < n; j++) {
    			b[i][j] = temp.charAt(j);
    		}
    	}
    	
    	if (check(rotate(a), b)) {
            result = 1;
        } 
    	else if (check(rotate(rotate(a)), b)) {
            result = 2;
        }
    	else if (check(rotate(rotate(rotate(a))), b)) {
            result = 3;
        }
    	else if (check(reflect(a), b)) {
            result = 4;
        }
    	else if (check(rotate(reflect(a)), b)) {
            result = 5;
        }
    	else if (check(rotate(rotate(reflect(a))), b)) {
            result = 5;
        }
    	else if (check(rotate(rotate(rotate(reflect(a)))), b)) {
            result = 5;
        }
    	else if (check(a, b)) {
            result = 6;
        }
    	else {
            result = 7;
        }
    	
        return result;

    }
    
    private static char[][] reflect(char[][] a) {
        char[][] b = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i][n-1-j];
            }
        }
        return b;
    }
    
    private static char[][] rotate(char[][] a){
    	char[][] b = new char[n][n];
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			b[i][j] = a[n-j-1][i];
    		}
    	}
    	return b;
    }
    
    private static boolean check(char[][] a, char[][] b) {
        boolean result = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]!=b[i][j]) {
                	result = false;
                }
            }
        }
        return result;
    }

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}
