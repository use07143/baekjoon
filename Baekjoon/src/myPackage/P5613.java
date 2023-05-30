package myPackage;

import java.io.*;

public class P5613 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char c = ' ';
		
		while(true) {
			String s = br.readLine();
			
			if(s.charAt(0) == '=') break;
			
			if(48 <= s.charAt(0) && s.charAt(0) <= 57) {
				if(c == '+') n += Integer.parseInt(s);
				else if(c == '-') n -= Integer.parseInt(s);
				else if(c == '*') n *= Integer.parseInt(s);
				else if(c == '/') n /= Integer.parseInt(s);
			} else {
				c = s.charAt(0);
			}
		}
		
		bw.write(n + "");
		
		bw.flush();
		bw.close();
	}
}
