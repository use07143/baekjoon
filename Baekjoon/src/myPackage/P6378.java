package myPackage;

import java.io.*;

public class P6378 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {

			String s = br.readLine();
			
			if(s.equals("0")) break;
				
			while(true) {
					
				int sum = 0;
					
				if(s.length() < 2) {
					break;
				}else {
					for(int i = 0; i < s.length(); i++) {
						sum += s.charAt(i) - '0';
					}
				}

				s = String.valueOf(sum);
			}
			bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
