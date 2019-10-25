package December_2015;

import java.util.*;
import java.io.*;
public class speeding {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, m, temp1[][], temp2[][];
    public static void main(String[] args) {


        try {

            //Initialize in & out
            in = new Scanner(new File("speeding.in"));
            out = new PrintWriter(new File("speeding.out"));

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
    	temp1 = new int[n][2];
    	for (int i = 0; i < n; i++) {
    		temp1[i][0] = in.nextInt();
    		temp1[i][1] = in.nextInt();
    	}
    	temp2 = new int[m][2];
    	for (int i = 0; i < m; i++) {
    		temp2[i][0] = in.nextInt();
    		temp2[i][1] = in.nextInt();
    	}
    }


    private static String solve() {
    	int[] limit = new int[100];
    	int[] speed = new int[100];
    	int start = 0;
    	int end = 0;
    	for (int i = 0; i < n; i++) {
    		end = temp1[i][0] - 1 + start;
    		for (int j = start; j <= end; j++) {
    			limit[j] = temp1[i][1];
    		}
    		start += temp1[i][0];
    	}
    	start = 0;
    	end = 0;
    	for (int i = 0; i < m; i++) {
    		end = temp2[i][0] - 1 + start;
    		for (int j = start; j <= end; j++) {
    			speed[j] = temp2[i][1];
    		}
    		start += temp2[i][0];
    	}
    	int max = 0;
    	for (int i = 0; i < 100; i++) {
    		int over = 0;
    		over = speed[i] - limit[i];
    		max = Math.max(max, over);
    	}
    	if(max < 0)
    		max = 0;
    	return max + "";
    }

}
