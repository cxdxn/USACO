package January_2018;

import java.util.*;
import java.io.*;

public class outofplace {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static int n, arr[], temp[], res;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("outofplace.in"));
            out = new PrintWriter(new File("outofplace.out"));

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
        arr = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
        	arr[i] = in.nextInt();
        	temp[i] = arr[i];
        }
    }

    private static String solve() {
        Arrays.sort(temp);
        
        for (int i = 0; i < n; i++) {
        	if (arr[i] != temp[i]) {
        		res++;
        	}
        }
        res -= 1;
        //System.out.println(Arrays.toString(temp));
        //System.out.println(Arrays.toString(arr));
        return res + "";
    }

}
