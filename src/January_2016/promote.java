package January_2016;

import java.util.*;
import java.io.*;
public class promote {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int[] b, s, g, p;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("promote.in"));
            out = new PrintWriter(new File("promote.out"));

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
    	b = new int[2];
    	s = new int[2];
    	g = new int[2];
    	p = new int[2];
    	b[0] = in.nextInt();
    	b[1] = in.nextInt();
    	s[0] = in.nextInt();
    	s[1] = in.nextInt();
    	g[0] = in.nextInt();
    	g[1] = in.nextInt();
    	p[0] = in.nextInt();
    	p[1] = in.nextInt();
    }


    private static String solve() {
    	int btos = s[1] - s[0] + g[1] - g[0] + p[1] - p[0];
    	int stog = g[1] - g[0] + p[1] - p[0];
    	int gtop = p[1] - p[0];
    	
    	return btos + "\n" + stog + "\n" + gtop;
    }

}
