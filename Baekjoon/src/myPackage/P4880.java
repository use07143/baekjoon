package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P4880 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if((c-b) == (b-a)) {
				bw.write("AP " + (2*c - b));
			} else {
				bw.write("GP " + (c*c / b));
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
