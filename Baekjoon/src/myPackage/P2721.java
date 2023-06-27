package myPackage;

import java.io.*;

public class P2721 {
	
	static int[] tri = new int[302];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			long sum = 0;
			for(int j = 1; j <= n; j++) {
				sum += (j * t(j+1));
			}
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int t(int n) {
		if(tri[n] != 0) return tri[n];
		else {
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				sum += i;
			}
			return tri[n] = sum;
		}
	}
}
