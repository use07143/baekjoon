package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class P2420 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());
		
		int k = N.compareTo(M);
		
		if(k > 0) bw.write(N.subtract(M) + "");
		else bw.write(M.subtract(N) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
