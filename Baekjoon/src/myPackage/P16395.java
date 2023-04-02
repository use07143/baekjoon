package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P16395 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for(int i = 0; i <= n; i++) {
			arr[0][i] = 1;
		}
		
		for(int i = 0; i <= n; i++) {
			arr[i][0] = 1;
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				arr[j][i] = arr[j][i-1] + arr[j-1][i];
			}
		}
		
		bw.write(arr[n-k][k-1] + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
