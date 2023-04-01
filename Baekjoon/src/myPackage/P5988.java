package myPackage;

import java.io.*;
import java.math.BigInteger;

public class P5988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger k;
		long t = 2;
		
		for(int i = 0; i < n; i++) {
			k = new BigInteger(br.readLine());
			if(k.remainder(BigInteger.valueOf(t)).equals(BigInteger.ZERO)) bw.write("even\n");
			else bw.write("odd\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
