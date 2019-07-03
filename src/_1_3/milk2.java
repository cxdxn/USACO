//package _1_3;

/*
ID: cadenka1
LANG: JAVA
TASK: milk2
*/

import java.util.*;

//import practiceTest.Student;

import java.io.*;
public class milk2 {

static Scanner in;
static PrintWriter out;

//Input Variables
static int n;
static Cow[] list;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("milk2.in"));
            out = new PrintWriter(new File("milk2.out"));

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
    	n  = Integer.parseInt(in.nextLine());
    	list = new Cow[n];

    	for (int i = 0; i < n; i++) {
    		String[] temp = in.nextLine().split(" ");
    		
    		list[i] = new Cow(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
    	}
    	
    	Arrays.sort(list);
    }


    private static String solve() {
    	int start = list[0].start;
        int end = list[0].end;
        int cstart, cend;
        int idle = 0;
        int cont = 0;
        int maxC = 0;
        int maxB = 0;
        
        for (int i = 1; i < n; i++) {
        	cstart = list[i].start;
        	cend = list[i].end;
        	if (cend < end) {
        		continue;
        	}
        	else if (cstart <= end) {
        		end = cend;
        	}
        	else {
        		idle = cstart - end;
        		if (idle > maxB) {
        			maxB = idle;
        		}
        		cont = end - start;
        		if (cont > maxC) {
        			maxC = cont;
        		}
        		start = cstart;
        		end = cend;
        	}
        }
        
        if (end - start > maxC) {
        	maxC = end - start;
        }
        return maxC + " " + maxB;

    }
    
    static class Cow implements Comparable<Cow>{
    	
    	int start;
    	int end;
    	
    	public Cow(int s, int n) {
    		start = s;
    		end = n;
    	}
    	
    	public int compareTo(Cow that) {
			return this.start - that.start;
		}
		
    }
    
}
