package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5523 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		for(int i = 0; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score_a = Integer.parseInt(st.nextToken());
			int score_b = Integer.parseInt(st.nextToken());
			
			if(score_a > score_b) a++;
			else if(score_b > score_a) b++;
		}
		
		bw.write(a + " " + b);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
