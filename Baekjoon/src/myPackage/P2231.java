package myPackage;

import java.io.*;

public class P2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < N; i++) {
			int sum = 0;
			int M = i;
			while(M != 0) {
				sum += M%10;
				M /= 10;
			}
			sum += i;
			if(sum == N) {
				System.out.print(i);
				return;
			}
		}
		
		System.out.print(0);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
