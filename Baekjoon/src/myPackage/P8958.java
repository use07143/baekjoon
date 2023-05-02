package myPackage;

import java.io.*;

public class P8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int score, temp;
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			score = 0;
			temp = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					score += (temp + 1);
					temp++;
				} else { temp = 0; }
			}
			
			bw.write(score + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
