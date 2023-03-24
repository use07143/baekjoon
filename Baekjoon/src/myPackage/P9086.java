package myPackage;

import java.io.*;
import java.util.*;

public class P9086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			bw.write(str.charAt(0));
			bw.write(str.charAt(str.length()-1) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
