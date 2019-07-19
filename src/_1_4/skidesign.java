package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: skidesign
*/

import java.util.*;
import java.io.*;
public class skidesign {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int n, hills[];

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("skidesign.in"));
            out = new PrintWriter(new File("skidesign.out"));

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
    	hills = new int[n];
    	for (int i = 0; i < n; i++) {
    		hills[i] = in.nextInt();
    	}
    }


    private static int solve() {
        int result = Integer.MAX_VALUE;

		
        for (int i = 0; i <= 83; i++) {
    		int cost = 0;
        	for (int j = 0; j < n; j++) {
        		if (hills[j] > i + 17) {
        			cost += (hills[j] - (i + 17)) * (hills[j] - (i + 17));
        		}
        		else if (hills[j] < i) {
        			cost += (i - hills[j]) * (i - hills[j]);
        		}
        	}
    		if (cost < result) {
    			result = cost;
    		}
        }
        
        return result;
    }
}
