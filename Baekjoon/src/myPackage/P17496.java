package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P17496 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int day = N / T;
		if(N % T == 0) day--;
		
		long price = day * C * P;
		bw.write(price + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
