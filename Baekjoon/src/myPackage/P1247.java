package myPackage;

import java.io.*;
import java.math.BigInteger;

public class P1247 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 3; i++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for(int j = 0; j < n; j++) {
				BigInteger k = BigInteger.valueOf(Long.parseLong(br.readLine()));
				sum = sum.add(k);
			}
			if(sum.compareTo(BigInteger.ZERO) == 0) bw.write("0\n");
			else if(sum.compareTo(BigInteger.ZERO) < 0) bw.write("-\n");
			else bw.write("+\n");
		}
		
		bw.flush();
		bw.close();
	}
}
