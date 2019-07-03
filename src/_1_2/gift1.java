package _1_2;

/*
ID: cadenka1
LANG: JAVA
TASK: gift1
*/

import java.util.*;
import java.io.*;
public class gift1 {



static Scanner in;
static PrintWriter out;

//Input Variables
    static int np;
    static LinkedHashMap<String, Integer> list;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("gift1.in"));
            out = new PrintWriter(new File("gift1.out"));

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
    	list = new LinkedHashMap<String, Integer>();
    	np = Integer.parseInt(in.nextLine());
    	for (int i = 0; i < np; i++) {
    		list.put(in.nextLine(), 0);
    	}
    	//System.out.println(list);

    }


    private static String solve() {   
    	String result = "";
        for (int i = 0; i < np; i++) {
        	String name = in.nextLine();
        	String[] temp = in.nextLine().split(" ");
        	int amount = Integer.parseInt(temp[0]);
        	int ng = Integer.parseInt(temp[1]);
        	
        	
        	for (int j = 0; j < ng; j++) {
        		String receiver = in.nextLine();
        		if (ng == 0) {
        			continue;
        		}
        		else {
        			list.put(receiver, list.get(receiver) + (amount / ng));
        		}
        	}
        	if (ng > 0) {
        		list.put(name, list.get(name) + (amount % ng) - amount);
        	}
        	
        }
        
    	for (String s: list.keySet()) {
    		result += s + " " + list.get(s) + "\n";
    	}
    	
    	return result;
    }
    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}