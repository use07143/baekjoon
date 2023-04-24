package myPackage;

import java.io.*;

public class P2010 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int sum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < N; i++) {
			sum += Integer.parseInt(br.readLine());
			sum--;
		}
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
