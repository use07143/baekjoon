package myPackage;

import java.io.*;
import java.math.BigInteger;

public class P2935 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger n1 = new BigInteger(br.readLine());
		String str = br.readLine();
		BigInteger n2 = new BigInteger(br.readLine());
		
		if(str.charAt(0) == '*') bw.write(n1.multiply(n2) + "");
		else if(str.charAt(0) == '+') bw.write(n1.add(n2) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
