package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10953 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b+ "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
