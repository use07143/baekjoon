package myPackage;

import java.util.Scanner;

public class P10950 {
	public static void main(String[] args) {
		
		int n;
		int a, b;
		
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();
		
		int[] sum = new int[n];
		
		for(int i = 0; i < n; i++) {
			a = keyboard.nextInt();
			b = keyboard.nextInt();
			
			sum[i] = a+b;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(sum[i]);
		}
		
		keyboard.close();
	}

}
