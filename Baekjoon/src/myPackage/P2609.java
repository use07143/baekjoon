package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2609 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		bw.write(GCD(Math.min(n1, n2), Math.max(n1, n2)) + "");
		bw.newLine();
		bw.write(LCD(Math.min(n1, n2), Math.max(n1, n2)) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int GCD (int a, int b) {
		if(a % b == 0) return b;
		else return GCD(b, a % b);
	}
	
	public static int LCD (int a, int b) {
		return a*b / GCD(a,b);
	}
}
