package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P14490 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int lcd = LCD(Math.min(a, b), Math.max(a, b));
		
		bw.write(a/lcd + ":" +b/lcd);
		
		bw.flush();
		bw.close();
	}
	
	public static int LCD (int a, int b) {
		if(a % b == 0) return b;
		else return LCD(b, a % b);
	}
}
