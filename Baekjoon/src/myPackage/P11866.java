package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		int count = 1;
		int temp, now = k;
		
		for(int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		
		bw.write("<" + arr[k]);
		arr[k] = 0;
		
		while(count < n) {
			temp = 0;
			while(temp < k) {
				now++;
				if(now > n) now = 1;
				if(arr[now] != 0) temp++;
			}
			bw.write(", " + arr[now]);
			arr[now] = 0;
			count++;
		}
		bw.write(">");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
