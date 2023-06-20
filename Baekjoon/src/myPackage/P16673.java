package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P16673 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int total = 0;
		for(int i = 1; i <= c; i++) {
			int n = (k * i) + (p * i * i);
			total += n;
		}
		
		bw.write(total + "");
		
		bw.flush();
		bw.close();
	}
}
