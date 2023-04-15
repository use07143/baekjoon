package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1010 {
	
	static int[][] C = new int[30][30];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int N, M;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			bw.write(Combination(Math.max(N, M), Math.min(N, M)) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int Combination(int n, int m) {
		if(C[n][m] != 0) return C[n][m];
		else if(m == 0 || n == m) return C[n][m] = 1;
		else return C[n][m] = Combination(n-1, m-1) + Combination(n-1, m);
	}
}
