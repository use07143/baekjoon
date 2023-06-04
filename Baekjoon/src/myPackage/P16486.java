package myPackage;

import java.io.*;

public class P16486 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		
		double c = d1 * 2;
		c += (d2 * 2) * 3.141592;
		
		bw.write(String.format("%.6f", c));
		
		bw.flush();
		bw.close();
	}
}
