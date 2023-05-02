package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5347 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a, b;
		StringTokenizer st;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			long lcd = (long) a * b / GCD(a,b);
			
			bw.write(lcd + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static long GCD(int a, int b) {
		if(a % b == 0) return b;
		else return GCD(b, a % b);
	}
}
