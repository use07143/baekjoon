package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2914 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = a * (b - 1) + 1;
		
		bw.write(n + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
