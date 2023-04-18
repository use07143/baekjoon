package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.math.*;

public class P10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		bw.write(a.add(b) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}