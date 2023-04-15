package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11050 {

	public static void main(String[] args) throws IOException {
		
		// 이항계수 구하기 => 순서 없는 조합의 개수 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		bw.write(comb(n, k) + "");
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	public static int comb(int n1, int n2) {
		if(n1 == n2 || n2 == 0) return 1;
		else return comb(n1-1, n2) + comb(n1-1, n2-1);
	}

}
