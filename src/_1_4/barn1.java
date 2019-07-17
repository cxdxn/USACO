package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: barn1
*/

import java.util.*;
import java.io.*;
public class barn1 {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int m, s, c;
    static int[] num;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("barn1.in"));
            out = new PrintWriter(new File("barn1.out"));

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
    	m = in.nextInt();
    	s = in.nextInt();
    	c = in.nextInt();
    	num = new int[c];
    	for (int i = 0; i < c; i++) {
    		num[i] = in.nextInt();
    	}
    	Arrays.sort(num);
    }


    private static int solve() {
        int result = 0;
        int[] spaces = new int[c-1];
        for (int i = 0; i < c - 1; i++) {
        	spaces[i] = num[i+1] - num[i] - 1;
        }
        Arrays.sort(spaces);
        for (int i = 0; i < c - m; i++) {
        	result += spaces[i];
        }
        result += c;
        
        return result;

    }

}
