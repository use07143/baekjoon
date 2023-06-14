package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P14656 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(k != i) cnt++;
		}
		
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
