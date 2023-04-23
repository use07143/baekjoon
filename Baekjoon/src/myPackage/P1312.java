package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1312 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int res = A % B;
		for(int i = 1; i < N; i++) {
			res *= 10;
			res %= B;
		}
		
		res *= 10;
		bw.write(res/B + "");
		
		bw.flush();
		bw.close();
	}
}
