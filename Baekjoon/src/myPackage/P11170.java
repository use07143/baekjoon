package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11170 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b, temp;
		int cnt;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			cnt = 0;
			
			for(int j = a; j <= b; j++) {
				temp = j;
				if(temp == 0) cnt++;
				while(temp != 0) {
					if(temp % 10 == 0) cnt++;
					temp /= 10;
				}
			}
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
