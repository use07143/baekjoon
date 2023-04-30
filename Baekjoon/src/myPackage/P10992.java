package myPackage;

import java.io.*;

public class P10992 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			for(int j = N-1; j > i; j--) {
				bw.write(" ");
			}
			if (i == 0) bw.write("*");
			else if (i == N-1) {
				for(int j = 0; j < (2 * N - 1); j++) {
					bw.write("*");
				}
			} else {
				bw.write("*");
				for(int j = 0; j < (2 * i - 1); j++) {
					bw.write(" ");
				}
				bw.write("*");
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
