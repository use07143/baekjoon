package myPackage;

import java.io.*;

public class P5354 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 1) {
				bw.write("#");
				bw.newLine();
				bw.newLine();
				continue;
			}
			else if(n == 2) {
				bw.write("##\n##");
				bw.newLine();
				bw.newLine();
				continue;
			}
			for(int j = 0; j < n; j++) {
				bw.write("#");
			}
			bw.newLine();
			for(int j = 0; j < n-2; j++) {
				bw.write("#");
				for(int l = 0; l < n-2; l++) {
					bw.write("J");
				}
				bw.write("#");
				bw.newLine();
			}
			for(int j = 0; j < n; j++) {
				bw.write("#");
			}
			bw.newLine();
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
