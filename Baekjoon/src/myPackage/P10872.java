package myPackage;

import java.io.*;

public class P10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(fac(n) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static int fac (int n) {
		if(n == 0) return 1;
		else return n * fac(n-1);
	}
}