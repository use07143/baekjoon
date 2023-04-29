package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2460 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = 0;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num -= Integer.parseInt(st.nextToken());
			num += Integer.parseInt(st.nextToken());
			if(num > max) max = num;
		}
		
		bw.write(max + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
