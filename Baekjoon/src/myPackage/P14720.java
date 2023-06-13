package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P14720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = 0, cnt = 0;
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(st.nextToken());
			
			if(m == k) {
				cnt++;
				k++;
				if(k > 2) k %= 3;
			}
		}
		
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
