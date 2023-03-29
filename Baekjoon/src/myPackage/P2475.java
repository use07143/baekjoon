package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2475 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num, sum = 0;
		
		for(int i = 0; i < 5; i++) {
			num = Integer.parseInt(st.nextToken());
			sum += Math.pow(num, 2);
		}
		
		bw.write(sum%10 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
