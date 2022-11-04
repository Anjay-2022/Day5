package assignment;

import java.util.Scanner;

public class TwoDarrayp {
	Scanner sc = new Scanner(System.in);
	int m,n;
/*	public TwoDarrayp (int m,int n) {
		this.m = m;
		this.n = n;
	}  */
	int[][] arr = new int[m][n];
	
	public void takearray() {
		System.out.println("enter values  array ");
		/*m=sc.nextInt();
		n=sc.nextInt();  */
		System.out.println("Enter the no of rows");
		 m = sc.nextInt();
		System.out.println("Enter the no of columns");
		 n = sc.nextInt();
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public void display() {
		System.out.println("---printing array ---");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*/System.out.println("enter limit of array" );
		/System.out.println("Enter the no of rows");
		int m = sc.nextInt();
		System.out.println("Enter the no of columns");
		int n = sc.nextInt();		*/
		TwoDarrayp obj = new TwoDarrayp(); 
		//int[][] arr = new int[m][n];
        obj.takearray();
		obj.display();
	}
}
