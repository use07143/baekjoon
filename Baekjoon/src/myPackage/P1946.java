package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1946 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); // test case
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine()); // number of person
			int[] grade = new int[N+1];
			int cnt = 1; // pass
			
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				grade[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken()); // index - doc, value - interview
			}
			
			int min = grade[1];
			for(int j = 2; j <=N; j++) {
				if(grade[j] < min) {
					cnt++;
					min = grade[j];
				}
			}
			bw.write(cnt + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
