package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2783 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		double m = (double) 1000 / b;
		double price = a * m;
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			m = (double) 1000 / b;
			double p1 = a * m;
			
			if(p1 < price) price = p1;
		}
		
		bw.write(String.format("%.2f", price));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
