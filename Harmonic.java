package assignment;
import java.util.Scanner;

public class Harmonic {
	int lastnum=0;
	float num=0;

	public void num () {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter last term");
		lastnum = sc.nextInt();
	}
	public   void cal() {
		for(float i=1;i<=lastnum;i++) {
			num=num+(1/i);
		}System.out.println(num);
	}
	public void display() {
		System.out.println("Nth harmonic number is " +num);
	}
	public static void main(String[] args) {
		Harmonic o1 = new Harmonic();
		o1.num();
		o1.cal();
		o1.display();
	}
}
