package December_2015;

import java.util.*;
import java.io.*;
public class badmilk {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, m, d, s, p[], milk[], t[], sp[], st[];

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("badmilk.in"));
            out = new PrintWriter(new File("badmilk.out"));

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
    	m = in.nextInt();
    	d = in.nextInt();
    	s = in.nextInt();
    	p = new int[d];
    	milk = new int[d];
    	t = new int[d];
    	sp = new int[s];
    	st = new int[s];
    	for (int i = 0; i < d; i++) {
    		p[i] = in.nextInt();
    		milk[i] = in.nextInt();
    		t[i] = in.nextInt();
    	}
    	for (int i = 0; i < s; i++) {
    		sp[i] = in.nextInt();
    		st[i] = in.nextInt();
    	}
    }


    private static String solve() {
        String result = "";

        return result;

    }

}
