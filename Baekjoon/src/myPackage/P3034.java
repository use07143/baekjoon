package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P3034 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		double max = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		
		for(int i = 0; i < N; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k <= max) bw.write("DA\n");
			else bw.write("NE\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
