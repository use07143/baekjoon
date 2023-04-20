package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P2576 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 7; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n % 2 == 1) {
				sum += n;
				if(n < min) min = n;
			}
		}
		if(sum != 0) bw.write(sum + "\n" + min);
		else bw.write("-1");

		br.close();
		bw.flush();
		bw.close();
	}
}