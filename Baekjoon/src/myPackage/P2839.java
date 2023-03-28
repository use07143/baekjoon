package myPackage;

import java.io.*;

public class P2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		
		for(int x = 0; x <= 1000; x++) {
			for(int y = 0; y < 1666; y++) {
				int sum = x * 5 + y * 3;
				if(sum == n) {
					if(min > (x+y)) min = (x+y);
				}
			}
		}
		
		if(min == Integer.MAX_VALUE) bw.write("-1");
		else bw.write(min + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
