package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2864 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String min_a = a, min_b = b, max_a = a, max_b = b;
		
		if(a.contains("6")) {
			min_a = a.replace("6", "5");
		}
		if(a.contains("5")) {
			max_a = a.replace("5", "6");
		}
		if(b.contains("6")) {
			min_b = b.replace("6", "5");
		}
		if(b.contains("5")) {
			max_b = b.replace("5", "6");
		}
		
		int min = Integer.parseInt(min_a) + Integer.parseInt(min_b);
		int max = Integer.parseInt(max_a) + Integer.parseInt(max_b);
		
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
