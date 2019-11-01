package January_2016;

import java.util.*;
import java.io.*;
public class angry {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, hay[];

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("angry.in"));
            out = new PrintWriter(new File("angry.out"));

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
    	hay = new int[n];
    	for (int i = 0; i < n; i++) {
    		hay[i] = in.nextInt();
    	}
    }


    private static String solve() {
    	Arrays.sort(hay);
    	
    }
    
    public static int farthest(int n, boolean )

}
