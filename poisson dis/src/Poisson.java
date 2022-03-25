import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poisson{

    public static void main(String[] args) {
        double lamb = 2.5d;
        double k = 5d;
        DecimalFormat df = new DecimalFormat("0.000");
	    System.out.println(df.format(Poisson(k, lamb)));
    }
    
    public static double Poisson(double k, double lamb){
        return Math.pow(lamb, k) * Math.pow(Math.E, -lamb) / factorial(k);
    }
    
    public static double factorial(double n){
        double x = 1;
        for(double i = 2; i <= n; i++){
            x *= i;
        }
        return x;
    }
}
//0.067