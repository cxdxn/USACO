package December_2016;

import java.util.*;
import java.io.*;
public class blocks {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n;
    static String[] words;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("blocks.in"));
            out = new PrintWriter(new File("blocks.out"));

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
    	words = new String[n*2];
    	for (int i = 0; i < n*2; i++) {
    		words[i] = in.next();
    	}
    }


    private static String solve() {
        int[] alphabet = new int[26];
        
    }

}
