package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class P15964 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		BigInteger N1 = A.add(B);
		BigInteger N2 = A.subtract(B);
		BigInteger N = N1.multiply(N2);
		
		bw.write(N + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
