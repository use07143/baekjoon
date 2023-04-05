package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1712 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		if(B >= C) bw.write("-1");
		else bw.write((A/(C-B))+1 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
