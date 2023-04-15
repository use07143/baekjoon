package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int k = 1;
			for(int j = 0; j < b; j++) {
				k = (k * a) % 10;
			}
			if(k == 0) k = 10;
			
			bw.write(k + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
