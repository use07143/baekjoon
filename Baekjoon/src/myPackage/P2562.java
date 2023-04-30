package myPackage;

import java.io.*;

public class P2562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num;
		int count = 0, max = 0;
		
		for(int i = 0; i < 9; i++) {
			num = Integer.parseInt(br.readLine());
			if(num > max) {
				max = num;
				count = i+1;
			}
		}
		bw.write(max+"\n"+count);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
