package myPackage;

import java.io.*;

public class P15727 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		n -= 1;
		bw.write(n/5 + 1 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
