package myPackage;

import java.io.*;

public class P1264 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		int cnt;
		
		while(true) {
			str = br.readLine();
			if(str.equals("#")) break;
			
			cnt = 0;
			
			for(int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
				case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
					cnt++;
					break;
				default:
					break;
				}
			}
			
			bw.write(cnt + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
