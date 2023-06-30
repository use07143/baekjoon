package myPackage;

import java.io.*;

public class P5789 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			int k = s.length() / 2;
			
			if(s.charAt(k-1) == s.charAt(k)) bw.write("Do-it\n");
			else bw.write("Do-it-Not\n");
		}
		
		bw.flush();
		bw.close();
	}
}
