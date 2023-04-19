package myPackage;

import java.util.*;
import java.io.*;

public class P10813 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		int[] arr = new int[N];
		int temp = 0, i = 0, j = 0;
		
		for(int k = 0; k < N; k++) {
			arr[k] = k + 1;
		}
		
		for(int k = 0; k < M; k++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken()) - 1;
			j = Integer.parseInt(str.nextToken()) - 1;
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int k = 0; k < N; k++) { 
			bw.write(arr[k] + " ");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}