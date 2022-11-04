package assignment;

import java.util.Scanner;

public class Sumof3integerZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
		int count=1;
		System.out.println("enter values of array");
		for(int i = 0;i < range;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("-------All Possiblty----");
		for(int i = 0 ;i < range;i++) 
		{
			for(int j = i;j < range;j++)
			{
				for(int k = 0;k < range;k++) 
				{
					if(arr[i]+arr[j]+arr[k] == 0) {
						System.out.println(count+"arr[i]+arr[j]+arr[k]=0");
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"=0");
						count++;
					}
				}
			}
		}
	}
}