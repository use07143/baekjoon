package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P9325 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int price = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				price += (a * b);
			}
			bw.write(price + " \n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
