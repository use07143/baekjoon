package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10409 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sum = 0, cnt = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(st.nextToken());
			if(sum > T) break;
			
			cnt++;
		}
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
