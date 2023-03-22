package myPackage;

import java.util.*;
import java.io.*;

public class P11022 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n, a, b;
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
