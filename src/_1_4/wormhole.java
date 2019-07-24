package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: wormhole
*/

import java.util.*;
import java.io.*;

public class wormhole {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static int n, p[], x[], y[], hasRight[];

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("wormhole.in"));
			out = new PrintWriter(new File("wormhole.out"));

			init();

			// Write out file
			out.println(solve());

			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void init() {
		// Get data
		// Initialize Input Variables
		n = in.nextInt();
		p = new int[n + 1];
		x = new int[n + 1];
		y = new int[n + 1];
		hasRight = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (x[j] > x[i] && y[i] == y[j]) {
					if (hasRight[i] == 0 || x[j] - x[i] < x[hasRight[i]] - x[i]) {
						hasRight[i] = j;
					}
				}
			}
		}
	}

	private static String solve() {
		String result = "";
		result = "" + recur();
		return result;

	}

	public static int recur() {
		int total = 0;
		int i = 1;
		for (i = 1; i <= n; i++) {
			if (p[i] == 0) {
				break;
			}
		}
		if (i > n) {
			if (hasLoop()) {
				return 1;
			} else {
				return 0;
			}
		}
		for (int j = i + 1; j <= n; j++) {
			if (p[j] == 0) {
				p[i] = j;
				p[j] = i;
				total += recur();
				p[i] = p[j] = 0;
			}
		}
		return total;
	}

	public static boolean hasLoop() {
    	for (int start = 1; start <= n; start++) {
    		int pos = start;
    		for (int count = 0; count < n; count++) {
    			pos = hasRight[p[pos]];
    		}
    		
    		if (pos != 0)
    			return true;
    	}
    	
    	return false;
    }

}
