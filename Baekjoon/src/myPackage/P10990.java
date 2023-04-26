package myPackage;

import java.io.*;

public class P10990 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			for(int j = n-1; j > i; j--) {
				bw.write(" ");
			}
			if(i == 0) bw.write("*\n");
			else {
				bw.write("*");
				for(int j = 0; j < (2*i - 1); j++) {
					 bw.write(" ");
				}
				bw.write("*\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
