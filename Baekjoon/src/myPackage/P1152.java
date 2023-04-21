package myPackage;

import java.util.*;
import java.io.*;

public class P1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = st.countTokens();
		
		bw.write(n + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}