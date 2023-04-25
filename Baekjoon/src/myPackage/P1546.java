package myPackage;

import java.util.*;
import java.io.*;

public class P1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		double sc = 0, sum = 0;
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) max = arr[i];
		}
		
		for(int i = 0; i < n; i++) {
			sc = ((double)arr[i] / (double)max) * 100.0;
			sum += sc;
		}
		bw.write(sum/n + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}