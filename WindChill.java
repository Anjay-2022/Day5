package assignment;

import java.util.Scanner;

public class WindChill {
	public static float calculate(int t,int v) {
		float wc = (float) (35.74 + 0.6215 * t +(0.4275 *t - 35.75) * Math.pow(v, 0.16));
	   return(wc);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the national weather program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day temperature within 0 to 50 range ");
		int temperature = sc.nextInt();
		System.out.println("Enter wind speed within 3 to 120km/hr range ");
		int windspeed = sc.nextInt();
		
		float windchill = calculate( temperature, windspeed);
		System.out.println("Effective tempertaure or WindChill of the  is :"+windchill);
	}
}
