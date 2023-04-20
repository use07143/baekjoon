package myPackage;

import java.io.*;

public class P10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int n = str.length();
		int f = 1;
		
		for(int i = 0; i < (n/2); i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) f = 0;
		}
		
		bw.write(f + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}