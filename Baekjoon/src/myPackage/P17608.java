package myPackage;

import java.io.*;

public class P17608 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 1, max = arr[n-1];
		for(int i = n-2; i >= 0; i--) {
			if( arr[i] > max ) {
				max = arr[i];
				cnt++;
			}
		}
		bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
