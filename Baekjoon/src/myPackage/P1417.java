package myPackage;

import java.io.*;
import java.util.Arrays;

public class P1417 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int vote = 0;
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if(i == 0) vote = k;
			arr[i] = k;
		}
		
		Arrays.sort(arr);
		
		if(n == 1) bw.write("0");
		else if(arr[n-1] == vote && arr[n-2] != arr[n-1]) bw.write("0");
		else {
			while(true) {
				arr[n-1]--;
				vote++;
				cnt++;
				Arrays.sort(arr);
				if(arr[n-1] < vote) break;
			}
			bw.write(cnt + "");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
