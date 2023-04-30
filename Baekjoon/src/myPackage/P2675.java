package myPackage;

import java.io.*;
import java.util.*;

public class P2675 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			int len = 0;
			while(len < s.length()) {
				for(int k = 0; k < n; k++) {
					bw.write(s.charAt(len));
				}
				len++;
			}
			
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
