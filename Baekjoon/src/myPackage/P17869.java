package myPackage;

import java.io.*;

public class P17869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		int cnt = 0;
		
		bw.write(SCS(n, cnt) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int SCS(long n, int cnt) {
		
		if(n == 1) return cnt;
		
		if(n % 2 == 0) {
			cnt++;
			return SCS(n/2, cnt);
		}
		else {
			cnt++;
			return SCS(n+1, cnt);
		}
	}
}
