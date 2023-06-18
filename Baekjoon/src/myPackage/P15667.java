package myPackage;

import java.io.*;

public class P15667 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < 101; i++) {
			if((1 + i + i*i) == n) {
				bw.write(i + "");
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
