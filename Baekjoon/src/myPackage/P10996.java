package myPackage;

import java.io.*;

public class P10996 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i ++) {
			if(n % 2 == 0) {
				for(int j = 0; j < (n/2); j++) {
					bw.write("* ");
				}
				bw.newLine();
				for(int j = 0; j < (n/2); j++) {
					bw.write(" *");
				}
				bw.newLine();
			} else {
				for(int j = 0; j < (n/2 +1); j++) {
					bw.write("* ");
				}
				bw.newLine();
				for(int j = 0; j < (n/2); j++) {
					bw.write(" *");
				}
				bw.newLine();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
