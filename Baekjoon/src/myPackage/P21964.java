package myPackage;

import java.io.*;

public class P21964 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		for(int i = n-5; i < n; i++) {
			bw.write(s.charAt(i));
		}
		
		bw.flush();
		bw.close();
	}
}
