package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11047 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		int count = 0;
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n-1; i >= 0; i--) {
			count += sum / arr[i];
			sum %= arr[i];
		}
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
