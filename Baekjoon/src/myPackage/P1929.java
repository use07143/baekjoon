package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1929 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] prime = new int[N+1];
		
		for(int i = 2; i <= N; i++) {
			prime[i] = i;
		}
		
		for(int i = 2; i <= N; i++) {
			if(prime[i] == 0) continue;
			for(int j = i + i; j <= N; j +=i ) {
				prime[j] = 0;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(prime[i] != 0) bw.write(prime[i] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}