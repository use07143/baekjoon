package myPackage;

import java.io.*;

public class P1284 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			String str = Integer.toString(n);
			int cnt = str.length() + 1;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '1') cnt += 2;
				else if(str.charAt(i) == '0') cnt += 4;
				else cnt += 3;
			}
			
			bw.write(cnt + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
