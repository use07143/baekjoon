package myPackage;

import java.util.*;
import java.io.*;

public class P10811 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		int[] arr = new int[N];
		int i = 0, j = 0, temp = 0;;
		
		for(int k = 0; k < N; k++) {
			arr[k] = k+1;
		}
		
		for(int k = 0; k < M; k++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());
			
			for(int n = i, m = j; n < m; n++, m--) {
				temp = arr[n-1];
				arr[n-1] = arr[m-1];
				arr[m-1] = temp;
			}
			
		}
		
		for(int k = 0; k < N; k++) {
			bw.write(arr[k] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}