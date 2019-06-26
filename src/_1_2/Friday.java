//package _1_2;

/*
ID: cadenka1
LANG: JAVA
TASK: friday
*/

import java.util.*;
import java.io.*;
public class friday {

static Scanner in;
static PrintWriter out;

		//Input Variables
	    static int n, start, days[], dates[]={ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	    public static void main(String[] args) {

	        try {

	            //Initialize in & out
	            in = new Scanner(new File("friday.in"));
	            out = new PrintWriter(new File("friday.out"));

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
	    	days = new int[7];
	    	start = 13;
	    	n = in.nextInt() + 1900;

	    }


	    private static String solve() {
	        String result = "";
	        //System.out.println(n);
	        for (int i = 1900; i < n; i++) {
	        	for (int j = 1; j <= 12; j++) {
	        		days[start % 7]++;
	        		start += dates[j];
	        		if (j == 2) {
	        			if (isLeap(i)) {
	        				//System.out.println(i);
	        				start+=1;
	        			}
	        		}
	        	}
	        }
	        
	        result = days[6]+" "+  days[0] + " "+ days[1] + " " + days[2] + " " + days[3] + " " + days[4] + " " + days[5];
	        return result;

	    }
	    
	    static boolean isLeap(int i) {
	    	if (i % 100 == 0) {
	    		if (i % 400 == 0) {
	    			return true;
	    		}
	    		else {
	    			return false;
	    		}
	    	}
	    	
	    	else if (i % 4 == 0) {
	    		return true;
	    	}
	    	
	    	else {
	    		return false;
	    	}
	    }
	    
	    

	    //Algorithm methods
//	    private static int change(String s) {
	//
	//
//	    }
}
