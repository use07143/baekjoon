package myPackage;

import java.io.*;
import java.math.BigInteger;

public class P15829 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		BigInteger b = new BigInteger("0");
		
		for(int i = 0; i < N; i++) {
			int k = (str.charAt(i) - 'a' + 1);
			int m = (int) (k * Math.pow(31, i));
			b = b.add(BigInteger.valueOf(m));
		}
		
		b.remainder(BigInteger.valueOf(1234567891));
		bw.write(b.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
