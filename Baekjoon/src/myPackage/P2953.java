package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2953 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int p = 0;
		int sum = 0, max = 0;
		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			if(sum > max) {
				max = sum;
				p = i+1;
			}
		}
		
		bw.write(p + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
