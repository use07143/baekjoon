package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1735 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int n2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		
		int lcd = LCD(Math.min(m1, m2), Math.max(m1, m2));
		
		int n = n1*(lcd/m1) + n2*(lcd/m2);
		int gcd = GCD(Math.min(n, lcd), Math.max(lcd, n));
		
		n /= gcd;
		lcd /= gcd;
		
		bw.write(n + " " + lcd);
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int GCD (int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static int LCD (int a, int b) {
		return a*b/GCD(a,b);
	}
}