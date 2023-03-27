package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P16430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int P = B - A;
		int Q = B;
		
		P /= GCD(P, Q);
		Q /= GCD(P, Q);
		
		bw.write(P + " " + Q);
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
	}
}

