package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: combo
*/

import java.util.*;
import java.io.*;
public class combo {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int n, a, b, c, d, e, f;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("combo.in"));
            out = new PrintWriter(new File("combo.out"));

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
    	a = in.nextInt();
    	b = in.nextInt();
    	c = in.nextInt();
    	d = in.nextInt();
    	e = in.nextInt();
    	f = in.nextInt();
    }


    private static int solve() {
        int result = 0;
        HashSet<String> combos = new HashSet<String>();
        int[] add = { -2, -1, 0, 1, 2 };
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
        		for (int k = 0; k < 5; k++) {
        			if (check(convert(a + add[i])) && check(convert(b + add[j])) && check(convert(c + add[k]))) {
            			combos.add(convert(a + add[i]) + " " + convert(b + add[j]) + " " + convert(c + add[k]));
        			}
        			else {
        				continue;
        			}
        		}
        	}
        }
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
        		for (int k = 0; k < 5; k++) {
        			if (check(convert(d + add[i])) && check(convert(e + add[j])) && check(convert(f + add[k]))) {
            			combos.add(convert(d + add[i]) + " " + convert(e + add[j]) + " " + convert(f + add[k]));
        			}
        			else {
        				continue;
        			}
        		}
        	}
        }
        result = combos.size();
        return result;
    }
    
    public static int convert(int i) {
    	if (i < 1) {
    		return n + i;
    	}
    	else if (i > n) {
    		return i - n;
    	}
    	return i;
    }
    
    public static boolean check(int i) {
    	if (i <= n && i >= 1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

}
