package myPackage;

import java.io.*;

public class P10179 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			double price = Double.parseDouble(br.readLine());
			price *= 0.8;
			
			bw.write(String.format("$%.2f", price)+ "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
