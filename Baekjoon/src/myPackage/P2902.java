package myPackage;

import java.io.*;

public class P2902 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		bw.write(str.charAt(0));
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == '-') bw.write(str.charAt(i+1));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
