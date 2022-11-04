package assignment;

import java.util.Scanner;

public class Primefactor {
	int primef=0;
	int num,flag;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		num = sc.nextInt();
	}
	public void store() {
		System.out.println("Prime factors are :");
		while(num > 0) {
			for(int i=2;i<=num;i++) {
				if (num%i == 0) {
					flag=i;
					break;
				}
			}
			if(flag != primef) {
				primef=flag;
				System.out.print(primef+",");
			}
			num=num/flag;
		}
	}
	public static void main(String[] args) {
		Primefactor p=new Primefactor();
		p.input();
		p.store();
	}
}
