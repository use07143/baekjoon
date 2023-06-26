package myPackage;

import java.io.*;

public class P17614 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			int k = i;
			while(k > 0) {
				int m = k % 10;
				if(m == 3 || m == 6 || m == 9) cnt++;
				
				k /= 10;
			}
		}
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
