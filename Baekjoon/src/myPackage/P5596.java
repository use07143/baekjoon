package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5596 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum1 = 0, sum2 = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			sum1 += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			sum2 += Integer.parseInt(st.nextToken());
		}
		
		if(sum1 >= sum2) bw.write(sum1 + "");
		else bw.write(sum2 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
