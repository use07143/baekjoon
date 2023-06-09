package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2083 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			if(s.equals("#") && a == 0 && w == 0) break;
			
			bw.write(s + " ");
			
			if(a > 17 || w >= 80) bw.write("Senior");
			else bw.write("Junior");
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
