package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5063 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if((r+c) > e) bw.write("do not advertise\n");
			else if((r+c) < e) bw.write("advertise\n");
			else bw.write("does not matter\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
