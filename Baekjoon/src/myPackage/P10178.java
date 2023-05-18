package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10178 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = a / b;
			int d = a % b;
			
			bw.write("You get " + c + " piece(s) and your dad gets " + d + " piece(s).\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
