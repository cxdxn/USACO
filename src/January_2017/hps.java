package January_2017;

import java.util.*;
import java.io.*;
public class hps {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, arr[][], res1, res2;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("hps.in"));
            out = new PrintWriter(new File("hps.out"));

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
        n = in.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
        	arr[i][0] = in.nextInt();
        	arr[i][1] = in.nextInt();
        }
    }


    private static String solve() {
        int[] temp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
        	temp[i] = arr[i][0] - arr[i][1];
        }
        
        for (int i = 0; i < n; i++) {
        	if (temp[i] == -2 || temp[i] == 1) {
        		res1++;
        	}
        	else if (temp[i] == -1 || temp[i] == 2) {
        		res2++;
        	}
        }
        
        res = Math.max(res1, res2);
        return res + "";
    }

}
