package myPackage;

import java.io.*;

public class P2443 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n - i; j++) {
				bw.write(" ");
			}
			for(int j = 0; j < 2*i - 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
