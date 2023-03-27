package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P13241 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		long a, b;
		
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		bw.write(LCD(a,b) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static long GCD (long a, long b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static long LCD (long a, long b) {
		return a * b / GCD(a,b);
	}
}