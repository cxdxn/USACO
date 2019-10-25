package December_2015;

import java.util.*;
import java.io.*;
public class paint {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int[] john, bessie;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("paint.in"));
            out = new PrintWriter(new File("paint.out"));

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
    	john = new int[2];
    	for (int i = 0; i < 2; i++) {
    		john[i] = in.nextInt();
    	}
    	bessie = new int[2];
    	for (int i = 0; i < 2; i++) {
    		bessie[i] = in.nextInt();
    	}
    }


    private static String solve() {
    	int[] painted = new int[100];
    	int ans = 0;
    	for (int i = john[0]; i < john[1]; i++) {
    		painted[i]++;
    	}
    	for (int i = bessie[0]; i < bessie[1]; i++) {
    		painted[i]++;
    	}
    	for (int i = 0; i < 100; i++) {
    		if (painted[i] > 0) {
    			ans++;
    		}
    	}
    	
    	return ans + "";
    }

}
