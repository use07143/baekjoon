package myPackage;

import java.io.*;

public class P9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int ps = 1;
			int par = 0;
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				
				if(str.charAt(j) == '(') par ++;
				else par--;
				
				if(par < 0) {
					ps = 0;
					break;
				}
			}
			
			if(par != 0) ps = 0;
			
			if(ps == 1) bw.write("YES\n");
			else bw.write("NO\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
