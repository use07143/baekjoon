package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P9506 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		int sum;
		
		while(true) {
						
			N = Integer.parseInt(br.readLine());
			if(N == -1) break;
			 
			sum = 0;
			
			for(int i = 1; i < N; i++) {
				if(N % i == 0) sum += i;
			}
			
			if(sum == N) {
				bw.write(N + " = 1");
				for(int i = 2; i < N; i++) {
					if(N % i == 0) bw.write(" + " + i);
				}
			} else bw.write(N + " is NOT perfect.");
			
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}