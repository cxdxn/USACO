package January_2019;

import java.util.*;
import java.io.*;

public class shell {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static int n, a[], b[], g[], score, max, shells[] = { 0, 0, 0, 0 };

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("shell.in"));
			out = new PrintWriter(new File("shell.out"));

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
		a = new int[n + 1];
		b = new int[n + 1];
		g = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			g[i] = in.nextInt();
		}
		
		max = 0;
	}
	
	private static String solve() {
		for (int i = 1; i < 4; i++) {
			shells = new int[4];
			shells[i] = 1;
			score = 0;
			
			for (int j = 1; j <= n; j++) {
				int num = shells[a[j]];
				shells[a[j]] = shells[b[j]];
				shells[b[j]] = num;
				if (shells[g[j]] == 1)
					score++;
			}
			
			
			max = Math.max(max, score);
		}
		
		return ""+max;
	}
}