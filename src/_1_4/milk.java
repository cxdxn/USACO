package _1_4;

/*
ID: cadenka1
LANG: JAVA
TASK: milk
*/

import java.util.*;
import java.io.*;
public class milk {

static Scanner in;
static PrintWriter out;

//Input Variables
    static int n, m;
    static Farmer[] list;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("milk.in"));
            out = new PrintWriter(new File("milk.out"));

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
    	list = new Farmer[m];
    	for (int i = 0; i < m; i++) {
    		list[i] = new Farmer(in.nextInt(), in.nextInt());
    	}
    	
    	Arrays.sort(list);
    }


    private static int solve() {
        int result = 0;
        int total = n;
        for (int i = 0; i < m; i++) {
        	if (list[i].amount >= total) {
        		result += list[i].price * total;
        		total = 0;
        		break;
        	}
        	else {
        		result += list[i].price * list[i].amount;
        		total -= list[i].amount;
        	}
        }
        return result;
    }
    
    static class Farmer implements Comparable<Farmer>{
    	int price;
    	int amount;
    	
    	public Farmer(int p, int a) {
    		price = p;
    		amount = a;
    		
    	}

		@Override
		public int compareTo(Farmer that) {
			// TODO Auto-generated method stub
			return this.price - that.price;
		}
    }

}
