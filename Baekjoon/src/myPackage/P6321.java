package myPackage;

import java.io.*;

public class P6321 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			bw.write("String #" + i + "\n");
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 90) bw.write("A");
				else bw.write(str.charAt(j) + 1);
			}
			bw.newLine();
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
