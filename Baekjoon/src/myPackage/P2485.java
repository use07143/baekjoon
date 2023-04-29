package myPackage;

import java.io.*;

public class P2485 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] tree = new int[n];
		
		for(int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}
		
		int gcd = tree[1] - tree[0];
		
		for(int i = 1; i < n-1; i++) {
			gcd = GCD(Math.min(gcd, tree[i] - tree[i-1]), Math.max(gcd, tree[i] - tree[i-1]));
		}
		
		int count = ( (tree[n-1] - tree[0]) / gcd ) - n + 1;
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int GCD (int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
}