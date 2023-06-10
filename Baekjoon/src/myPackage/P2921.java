package myPackage;

import java.io.*;

public class P2921 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= i; j++) {
				sum += (i + j);
			}
		}
		
		bw.write(sum + "");
		
		bw.flush();
		bw.close();
	}
}
