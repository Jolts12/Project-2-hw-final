
	import java.io.*;
	import java.util.*;

	public class Geometric {

	    public static void main(String[] args) {
	         double p = 1.0/3.0;
	         double n = 5;
	        
	         double r = Math.pow(1.0-p, n-1) * p;
	        
	        System.out.printf("%.3f", r);
	    }
	}

//0.066