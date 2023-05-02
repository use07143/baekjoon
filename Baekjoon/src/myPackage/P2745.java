package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2745 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		long n = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(65 <= s.charAt(s.length() - i-1) && s.charAt(s.length() - i-1) <= 90) {
				n += ((s.charAt(s.length() - i-1) - 55) * Math.pow(b, i));
			} else {
				n += ((s.charAt(s.length() - i-1) - '0') * Math.pow(b, i));
			}
		}
		
		bw.write(n + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
