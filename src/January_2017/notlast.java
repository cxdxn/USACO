package January_2017;

import java.util.*;
import java.io.*;
public class notlast {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static String [] list;

    public static void main(String[] args) {

        try {

        	//Initialize in & out
            in = new Scanner(new File("notlast.in"));
            out = new PrintWriter(new File("notlast.out"));

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
    	
    }


    private static String solve() {
        return "";
    }
}
