package myPackage;

import java.io.*;

public class P3053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(br.readLine());
		
		double u = Math.pow(r, 2) * Math.PI;
		double t = Math.pow(r, 2) * 2;
		
		String uc = String.format("%.6f", u);
		String ta = String.format("%.6f", t);
		
		bw.write(uc + "\n" + ta);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
