package myPackage;

import java.util.*;
import java.io.*;

public class P10810 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		str = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		int[] arr = new int[N];
		int i = 0, j = 0, k = 0;
		
		for(int x = 0; x < M; x++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());
			k = Integer.parseInt(str.nextToken());
			
			for(int y = i-1; y < j; y++) {
				arr[y] = k;
			}
		}
		
		for(int x = 0; x < N; x++) {
			bw.write(arr[x] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}