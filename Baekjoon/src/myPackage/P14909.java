package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P14909 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		int k = st.countTokens();
		for(int i = 0; i < k; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n > 0) cnt++;
		}
		
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
