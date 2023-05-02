package myPackage;

import java.io.*;
import java.lang.StringBuilder;

public class P9935 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String sub = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			
			boolean same = true;
			if(sb.length() >= sub.length()) {
				for(int j = 0; j < sub.length(); j++) {
					if(sb.charAt(sb.length() - sub.length() + j) != sub.charAt(j)) {
						same = false;
						break;
					}
				}
				if(same) {
					sb.delete(sb.length() - sub.length(), sb.length());
				}
			}
		}
		
		if(sb.length() == 0) bw.write("FRULA");
		else bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
