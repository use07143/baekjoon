package myPackage;

import java.io.*;

public class P10162 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n % 10 != 0) bw.write("-1");
		else {
			int a = 0, b = 0, c = 0;
			a = (n / 300);
			n %= 300;
			b = (n / 60);
			n %= 60;
			c = (n / 10);
			
			bw.write(a + " " + b + " " + c);
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}
