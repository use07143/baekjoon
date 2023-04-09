package myPackage;

import java.io.*;
import java.lang.StringBuilder;

public class P11721 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder str = new StringBuilder(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int cnt = str.length();
		
		while(cnt > 0) {
			if(cnt >= 10) {
				for(int i = 0; i < 10; i++) {
					sb.append(str.charAt(i));
				}
				sb.append("\n");
				cnt -= 10;
				str.delete(0, 10);
			} else {
				for(int i = 0; i < cnt; i++) {
					sb.append(str.charAt(i));
				}
				sb.append("\n");
				cnt = 0;
			}
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
