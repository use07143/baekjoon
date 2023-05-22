package myPackage;

import java.io.*;

public class P5554 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		
		cnt += Integer.parseInt(br.readLine());
		cnt += Integer.parseInt(br.readLine());
		cnt += Integer.parseInt(br.readLine());
		cnt += Integer.parseInt(br.readLine());
		
		bw.write(cnt / 60 + "\n");
		bw.write(cnt % 60 + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
