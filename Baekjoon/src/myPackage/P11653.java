package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P11653 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N != 1) {
			for(int i = 2; i <= N; i++) {
				if(N % i == 0) {
					bw.write(i + "\n");
					N /= i;
					break;
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}