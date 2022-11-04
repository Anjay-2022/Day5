package assignment;

import java.util.Scanner;

public class LeapYear {
	int year;
	int century;
	public void takeyear () {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Year");
    year = sc.nextInt();
    }
    
	public void check () {
		century=year/100;
		if(year%4== 0) {
			if(year%100==0) {
				if(year%400==0) {
				System.out.println("Year is leap year");
				} else {
					System.out.println("NOt a leap year");
				}
			} else
			{System.out.println("Year is  leap year");}
		} else {
			System.out.println("Not a leap Year");
		}
	}
	public static void main(String[] args) {
		LeapYear  o1 = new LeapYear();
		o1.takeyear();
		o1.check();
		
		

	}

}
