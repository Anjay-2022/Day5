package assignment;

import java.util.Scanner;

public class RemainderQuotient {
	float dividend,divisor;
	int Quotient,remainder;
	
	public void takenumbers () {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dividend & divisor");
		dividend = sc.nextFloat();
	    divisor = sc.nextFloat();
	}
	public void remainder() {
		 remainder = (int) (dividend % divisor);
	}
	public void Quotient() {
		 Quotient = (int) (dividend / divisor);
	}
	public void display() {
		System.out.println("Remainder is :"+remainder);
		System.out.println("Quotient is :"+Quotient);
	}
	

	public static void main(String[] args) {
		RemainderQuotient object = new RemainderQuotient();
		object.takenumbers();
		object.remainder();
		object.Quotient();
		object.display();
		
	}

}
