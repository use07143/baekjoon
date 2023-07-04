package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1837 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int a = 0, b = 0;
		for(int i = 2; i < p; i++) {
			if(p % i == 0) {
				a = i;
				b = p / i;
				break;
			}
		}
		
		if(a < k) bw.write("BAD " + a);
		else if(b < k) bw.write("BAD " + b);
		else bw.write("GOOD");
		
		bw.flush();
		bw.close();
	}
}
