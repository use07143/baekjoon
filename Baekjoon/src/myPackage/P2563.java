package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2563 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] paper = new int[100][100];
		
		int x, y;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			for(int m = (100 - y); m > (90 - y); m--) {
				for(int n = x; n < (x + 10); n++) {
					paper[m][n] = 1;
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				sum += paper[i][j];
			}
		}
		
		bw.write(sum + "");
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}