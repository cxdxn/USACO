package January_2019;

import java.util.*;
import java.io.*;
public class sleepy {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static String [] list;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("sleepy.in"));
            out = new PrintWriter(new File("sleepy.out"));

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

}
