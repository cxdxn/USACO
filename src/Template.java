	/*
	ID: cadenka1
	LANG: JAVA
	TASK: 
	*/

import java.util.*;
import java.io.*;
public class Template {



    static Scanner in;
    static PrintWriter out;

    //Input Variables
	    static String [] list;

	    public static void main(String[] args) {

	        try {

	            //Initialize in & out
	            in = new Scanner(new File("xxx.in"));
	            out = new PrintWriter(new File("xxx.out"));

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
	    	


	    }


	    private static String solve() {
	        String result = "";

	        return result;

	    }

	    //Algorithm methods
//	    private static int change(String s) {
	//
	//
//	    }
}
