package myPackage;

import java.util.*;
import java.io.*;

public class P10812 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		int[] arr = new int[N];
		int[] temp = null;
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		int i = 0, j = 0, k = 0;
		
		for(int n = 0; n < M; n++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());
			k = Integer.parseInt(str.nextToken());
			
			temp = new int[j-i+1];
			for(int m = 0; m < j-k+1; m++) {
				temp[m] = arr[k-1+m];
			}
			for(int m = 0, a = j-k+1; m < k-i; m++, a++) {
				temp[a] = arr[i+m-1];
			}
			for(int m = 0, a = i-1; m < j-i+1; m++, a++) {
				arr[a] = temp[m];
			}
		}
		
		for(int n = 0; n < N; n++) {
			bw.write(arr[n] + " ");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}