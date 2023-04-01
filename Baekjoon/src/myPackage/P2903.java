package myPackage;

import java.io.*;

public class P2903 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int square = (int) Math.pow(2, n);

		bw.write((int)Math.pow(square + 1, 2) +"");
		
		bw.flush();
		bw.close();
	}
}
