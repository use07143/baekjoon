package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P20053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for(int j = 0; j < n; j++) {
				int k = Integer.parseInt(st.nextToken());
				if(k < min) min = k;
				if(k > max) max = k;
			}
			bw.write(min + " " + max + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
