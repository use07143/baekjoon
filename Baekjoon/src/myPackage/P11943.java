package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11943 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int sum1 = a + d;
		int sum2 = b + c;
		
		if(sum1 < sum2) bw.write(sum1 + "");
		else bw.write(sum2 + "");
		
		bw.flush();
		bw.close();
	}
}
