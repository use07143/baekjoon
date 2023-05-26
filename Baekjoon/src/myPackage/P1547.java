package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1547 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int k = 1;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == k) k = b;
			else if(b == k) k = a;
		}
		
		bw.write(k + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
