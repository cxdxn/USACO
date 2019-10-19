//package January_2018;

import java.util.*;
import java.io.*;
public class lifeguards {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, start[], end[];

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("lifeguards.in"));
            out = new PrintWriter(new File("lifeguards.out"));

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
    	start = new int[n];
    	end = new int[n];
    	for (int i = 0; i < n; i++) {
    		start[i] = in.nextInt();
    		end[i] = in.nextInt();
    	}
    }


    private static String solve() {
        int[] time = new int[1000];
        int ans = 0;
        for (int i = 0; i < n; i++) {
        	for (int j = start[i]; j < end[i]; j++) {
        		time[j]++;
        	}
        }
        for (int i = 0; i < n; i++) {
        	int shiftCovered = 0;
        	for (int j = start[i]; j < end[i]; j++) {
        		time[j]--;
        	}
        	for (int j = 0; j < 1000; j++) {
        		if (time[j] >= 1) {
        			shiftCovered++;
        		}
        	}
        	ans = Math.max(ans, shiftCovered);
        	for (int j = start[i]; j < end[i]; j++) {
        		time[j]++;
        	}
        }
        return "" + ans;
    }
}
