package myPackage;

import java.io.*;

public class P14470 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int k;
		if(a < 0) k = 1;
		else k = 0;
		
		while(a < b) {
			if(a < 0) {
				cnt -= (a * c);
				a = 0;
			}
			else if(a == 0 && k == 1) {
				cnt += d;
				k = 0;
			}
			else {
				cnt += e;
				a++;
			}
		}
		
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
