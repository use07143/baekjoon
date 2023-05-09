package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1225 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		long sum = 0;
		
		for(int i = 0; i < str1.length(); i++) {
			for(int j = 0; j < str2.length(); j++) {
				int a = str1.charAt(i) - '0';
				int b = str2.charAt(j) - '0';
				sum += ( a * b );
			}
		}
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
