package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2506 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, temp = 0;
		
		for(int i = 0; i < n; i++) {
			int q = Integer.parseInt(st.nextToken());
			
			if(q == 1) {
				sum += (1 + temp++);
			} else temp = 0;
		}
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
