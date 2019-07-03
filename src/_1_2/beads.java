package _1_2;

/*
ID: cadenka1
LANG: JAVA
TASK: beads
*/

import java.util.*;
import java.io.*;
public class beads {

static Scanner in;
static PrintWriter out;

	//Input Variables
    static String [] list;
    static String beads, necklace;
    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("beads.in"));
            out = new PrintWriter(new File("beads.out"));

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
    	
        beads = in.nextLine();
		necklace = in.nextLine();


    }


    private static String solve() {
        String result = "";
        int n = Integer.parseInt(beads);
		necklace += necklace;
		int max = 0;
		for (int i = 0; i < n; i++){
			int curr = method(necklace,i);
			if (curr > max){
				if (curr >= n){
					max = n;
				}
				else{
					max = curr;
				}
			}
		}
		result = max+"";
        return result;

    }
    
	public static int method(String necklace, int idx){
		char [] bnecklace = necklace.toCharArray();
		int c = 0;
		if (bnecklace[idx] == 'w'){
			for (int i = idx; i < bnecklace.length; i++){
				if (bnecklace[i] != 'w'){
					break;
				}
				else{
					c++;
					idx++;
				}
			}
		}
		if (idx < bnecklace.length){
			if (bnecklace[idx] == 'r'){
			for (int i = idx; i < bnecklace.length; i++){
				if (bnecklace[i] == 'b'){
					break;
				}
				else{
					c++;
					idx++;
				}
			}
			for (int i = idx; i < bnecklace.length; i++){
				if (bnecklace[i] == 'r'){
					break;
				}
				else{
					c++;
				}
			}
		}
		else if (bnecklace[idx] == 'b'){
			for (int i = idx; i < bnecklace.length; i++){
				if (bnecklace[i] == 'r'){
					break;
				}
				else{
					c++;
					idx++;
				}
			}
			for (int i = idx; i < bnecklace.length; i++){
				if (bnecklace[i] == 'b'){
					break;
				}
				else{
					c++;
				}
			}
		}
	}
		return c;
	}

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }
}
