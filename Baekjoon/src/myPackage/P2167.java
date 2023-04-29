package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2167 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int a, b, c, d;
		int sum;
		
		for(int k = 0; k < t; k++) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			for(int i = a-1; i < c; i++) {
				for(int j = b-1; j < d; j++) {
					sum += arr[i][j];
				}
			}
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
