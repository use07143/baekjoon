package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10824 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken() + st.nextToken();
		String b = st.nextToken() + st.nextToken();
		
		long res = Long.parseLong(a) + Long.parseLong(b);
		bw.write(res + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
