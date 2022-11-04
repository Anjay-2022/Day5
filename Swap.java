package assignment;

import java.util.Scanner;

public class Swap {
	int n1=0,n2=0;
	
	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
	    n1 = sc.nextInt();
	    n2 = sc.nextInt();
	    }
	public void swap() {
		System.out.println("-----------------------");
		int c=n1;
		n1=n2;
		n2=c;
	}
	public void display() {
		System.out.println("Number1 is :"+n1);
		System.out.println("Number2 is :"+n2);
	}

	public static void main(String[] args) {
		Swap s = new  Swap();
        s.input();
        s.swap();
        s.display();
	}

}
