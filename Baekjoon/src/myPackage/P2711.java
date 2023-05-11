package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class P2711 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder(st.nextToken());
			
			sb.deleteCharAt(n-1);
			bw.write(sb.toString() + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
