package myPackage;

import java.io.*;
import java.lang.StringBuilder;

public class P1032 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder(br.readLine());
		
		for(int i = 1; i < n; i++) {
			StringBuilder str2 = new StringBuilder(br.readLine());
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) != str2.charAt(j)) {
					str.setCharAt(j, '?');
				}
			}
		}
		
		bw.write(str.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
