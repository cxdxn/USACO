package January_2019;

import java.util.*;
import java.io.*;
public class guess {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n;
    static Set<String>[] a;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("guess.in"));
            out = new PrintWriter(new File("guess.out"));

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
    	a = new HashSet[n];
    	for (int i = 0; i < n; i++) {
    		a[i] = new HashSet<String>();
    		in.next();
    		int n1 = in.nextInt();
    		for (int j = 0; j < n1; j++) {
    			a[i].add(in.next());
    		}
    	}
    	
    	//System.out.println(Arrays.toString(a));
    }

    private static String solve() {
    	int max = 0;
        for (int i = 0; i < n-1; i++) {
        	for (int j = i + 1; j < n; j++) {    	
        		int same = 0;
        		for (String s : a[i]) {
        			if (a[j].contains(s)) {
        				same++;		
        			}
        		}
        		//System.out.println(same);
        		max = Math.max(max, same);
        	}
        }
        //System.out.println(max);
        return max + 1 + "";
    }

}
