package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11945 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < a; i++) {
			String s = br.readLine();
			
			for(int j = 1; j <= b; j++) {
				bw.write(s.charAt(s.length()-j));
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
