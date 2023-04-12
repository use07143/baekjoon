package myPackage;

import java.io.*;

public class P5585 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		n = 1000 - n;
		
		cnt += (n / 500);
		n %= 500;
		cnt += (n / 100);
		n %= 100;
		cnt += (n / 50);
		n %= 50;
		cnt += (n / 10);
		n %= 10;
		cnt += (n / 5);
		n %= 5;
		cnt += n;
		
		bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();

	}

}
