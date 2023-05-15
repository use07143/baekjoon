package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P15969 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			if(score > max) max = score;
			if(score < min) min = score;
		}
		
		bw.write(max-min +"");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
