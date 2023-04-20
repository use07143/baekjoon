package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10984 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int c, count;
		float g, sum, avg;
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			count = 0;
			sum = 0;
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				c = Integer.parseInt(st.nextToken());
				g = Float.parseFloat(st.nextToken());
				
				sum += (c * g);
				count += c;
			}
			
			avg = Math.round((sum / count) * 10);
			bw.write(count + " " + avg/10 + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
