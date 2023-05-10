package myPackage;

import java.math.BigInteger;
import java.io.*;
import java.util.StringTokenizer;

public class P1252 {
	
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger b1 = new BigInteger(st.nextToken());
        BigInteger b2 = new BigInteger(st.nextToken());

        String s1 = b1.toString();
        String s2 = b2.toString();

        BigInteger a = new BigInteger(s1, 2);
        BigInteger b = new BigInteger(s2, 2);

        BigInteger sum = a.add(b);

        String result = sum.toString(2);
        bw.write(result);
        
        br.close();
		bw.flush();
		bw.close();
    }
}