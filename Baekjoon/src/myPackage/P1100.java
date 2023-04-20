package myPackage;

import java.io.*;

public class P1100 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		
		String str;
		for(int i = 0; i < 8; i++) {
			str = br.readLine();
			for(int j = 0; j < 8; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0 && str.charAt(j) == 'F') count++;
				} else {
					if(j % 2 == 1 && str.charAt(j) == 'F') count++;
				}
			}
		}
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
