package myPackage;

import java.io.*;

public class P7567 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int cnt = 10;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) cnt += 5;
			else cnt += 10;
		}
		
		bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
