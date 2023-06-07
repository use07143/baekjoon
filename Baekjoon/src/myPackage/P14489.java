package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P14489 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		n *= 2;
		
		if((a+b) >= n) bw.write(a+b-n + "");
		else bw.write(a+b + "");
		
		bw.flush();
		bw.close();
	}
}
