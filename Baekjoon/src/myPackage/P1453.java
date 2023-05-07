package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1453 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[101];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(arr[k] == 0) arr[k] = 1;
			else cnt++;
		}
		bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
