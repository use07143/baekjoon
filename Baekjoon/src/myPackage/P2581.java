package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int sum = 0, min = Integer.MAX_VALUE, prime;
		
		for(int i = N; i <= M; i++) {
			
			prime = 1;
			
			if(i == 1) continue;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					prime = 0;
					break;
				}
			}
			
			if(prime == 1) {
				sum += i;
				if(min > i) min = i;
			}
		}
		
		if(sum == 0) bw.write(-1 + "");
		else bw.write(sum + "\n" + min);
		
		br.close();
		bw.flush();
		bw.close();
	}
}