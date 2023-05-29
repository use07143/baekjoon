package myPackage;

import java.io.*;

public class P11365 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			if(s.equals("END")) break;
			
			for(int i = 0; i < s.length(); i++) {
				bw.write(s.charAt(s.length()-i-1));
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
